package abst.identityHashMAp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsPartitioningBy {
    public static void main(String[] args) {
        Student s1 = new Student("Ram", 18);
        Student s2 = new Student("Shyam",22);
        Student s3 = new Student("Mohan",19);
        Student s4 = new Student("Mahesh",20);
        Student s5 = new Student("Krishna",21);
        List<Student> list = Arrays.asList(s1,s2,s3,s4,s5);
        //partition of Student on the basis of age
        System.out.println("----Partition of Student on the basis of age >20 ----");
        Map<Boolean, List<Student>> stdByClass = list.stream()
                    .collect(Collectors.partitioningBy(s -> s.getAge() > 20));
        
        stdByClass.forEach((k,v)->System.out.println("Key:"+k+"  "+ 
                ((List<Student>)v).stream().map(s->s.getName()).collect(Collectors.joining(","))));
        
        List<Student> listpresent=stdByClass.get(true);
        System.out.println(listpresent);
    }
} 

class Student {
    private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
    
} 
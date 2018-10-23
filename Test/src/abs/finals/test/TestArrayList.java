package abs.finals.test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {
        
        List l= new ArrayList<>();
        l.add(1);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);
        l.add(16);
    //    System.out.println(l);
        
        List l1= new ArrayList<>();
        l1.add(1);
        l1.add(13);
        l1.add(18);
        l1.add(19);
        l1.add(17);
        l1.add(16);
        
        
        ArrayList<Employee> al= new ArrayList<>();
        
        ArrayList<Employee> al1= new ArrayList<>();
        
        
        Employee em= new Employee("a","d");
        Employee em1= new Employee("a1","d1");
        Employee em2= new Employee("a2","d2");
        Employee em3= new Employee("a3","d3");
        Employee em4= new Employee("Swhetha","d4");
        Employee em5= new Employee("a5","d5");
        Employee em6= new Employee("a6","d6");
        Employee em7= new Employee("a7","d7");
       String a="Swhetha";
        al.add(em);
        al.add(em1);
        al.add(em2);
        al.add(em3);
        al.add(em4);
        al.add(em5);
        al.add(em6);
        al.add(em7);
        for (Employee employee : al) {
           if(!a.equals(employee.getName())) {
               al1.add(employee);
           }
           else{
               System.out.println("hiiiiiiiiii    "+employee);
           }
        }
        System.out.println(al1);
      /*  List<Employee>  eml=   al.stream().filter(emp->!"a4".equals(emp.getName())).collect(Collectors.toList());
        System.out.println(eml);
        */
       // System.out.println(al);
        
       /* for (Object object : l1) {
            if(l.contains(l1)){
               System.out.println("duplicate element:"+ l1); 
            }
            else{
                System.out.println("Non duplicate element:"+ l1);  
            }
        }*/
       
     //   System.out.println(l);
        
        
    }
}

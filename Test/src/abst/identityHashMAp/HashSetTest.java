package abst.identityHashMAp;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
public static void main(String[] args) {
    Set integerSet = new TreeSet();
    integerSet.add(new Integer(17));
    integerSet.add(new Integer(1));
    integerSet.add(new Integer(4));
    integerSet.add(new Integer(9));
    
   // Integer i = new Integer(1);
    System.out.println(integerSet);
   /* System.out.println("using compartor :");
    Set<Integer> random = new HashSet<Integer>();
    for (int i = 0; i < 10; i++) {
        random.add((int) (Math.random() * 100));
    }

    System.out.println("Initial Set: " + random);
    Set<Integer> sorted = new TreeSet<Integer>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
       
    });
    sorted.addAll(random);
    System.out.println("Sorted Set: " + sorted);*/
    
    Employee emp= new Employee("saty",1,"IT",25);
    Employee emp1= new Employee("satty",2,"IT1",26);
    Employee emp2= new Employee("saaty",3,"IT2",27);
    Employee emp3= new Employee("sattty",4,"IT3",28);
    Employee emp4= new Employee("sattty",5,"IT4",29);
    Employee emp5= new Employee("sattty",6,"IT5",30);
    Employee emp6= new Employee("sattty",7,"IT6",31);
    
   // TreeSet<Employee> ts= new TreeSet<>(); // it will give class cast Exception
    TreeSet<Employee> ts= new TreeSet<>( new Comparator<Employee>() {

        @Override
        public int compare(Employee o1, Employee o2) {
            // TODO Auto-generated method stub
            return o2.getName().compareTo(o1.getName());
        }
    });
    ts.add(emp);
    ts.add(emp1);
    ts.add(emp2);
    ts.add(emp3);
    ts.add(emp4);
    ts.add(emp5);
    ts.add(emp6);
   // ts.add(emp);
    System.out.println(ts);
}
}

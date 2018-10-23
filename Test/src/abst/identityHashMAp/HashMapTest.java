package abst.identityHashMAp;

import java.util.HashMap;

public class HashMapTest {
public static void main(String[] args) {
    
    Employee emp= new Employee("saty",1,"IT",25);
    Employee emp1= new Employee("satty",2,"IT1",26);
    Employee emp2= new Employee("saaty",3,"IT2",27);
    Employee emp3= new Employee("sattty",4,"IT3",28);
    Employee emp4= new Employee("sattty",5,"IT4",29);
    Employee emp5= new Employee("sattty",6,"IT5",30);
    Employee emp6= new Employee("sattty",7,"IT6",31);
    
    HashMap<Employee, String> hm= new HashMap<>();
    hm.put(emp, "value");
    hm.put(emp1, "value1");
    hm.put(emp2, "value2");
    hm.put(emp3, "value3");
    hm.put(emp4, "value4");
    hm.put(emp5, "value5");
    hm.put(emp6, "value6");
    
    System.out.println(hm.size());
    System.out.println(hm.get(emp1));
}
}

package hash.map.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class TestMap {
public static void main(String[] args) {
    
    Employee e= new Employee("test","test1",20L);
    Employee e1= new Employee("test1","test12",24L);
    Employee e2= new Employee("test2","test13",25L);
    Employee e3= new Employee("test3","test13",26L);
    Employee e4= new Employee("test","test1",20L);
    // if we override hashcode and equals method  , but hashcode return fixed value and equals method return true, than hashmap size will always one.
    Map m= new HashMap<Employee,String>();
    m.put(e, "TEST");
    m.put(e1, "TEST");
    m.put(e2, "TEST");
    m.put(e3, null);
    m.put(e, "TEST");
    //// if we override hashcode and equals method  , but hashcode return fixed value and equals method return false, than hashmap size will always no of object added.
    System.out.println(m.size());
    System.out.println(m);
    
        Map im = new IdentityHashMap<Employee, String>();
        im.put(e, "TEST");
        im.put(e1, "TEST");
        im.put(e2, "TEST");
        im.put(e3, null);
        im.put(e, "TEST");
        System.out.println("Identty hash Map");
        System.out.println(im.size());
        System.out.println(im); 
        
        // Identity has map for equality check it use == operater instead of equals method .
        // doesnt matter in case of 

}
}

package abs.finals.test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Vector;

public class LinkedListTest {
    
    public static void main(String[] args) throws Exception  {
        
        ArrayList<Integer>  al = new ArrayList<Integer>(100);
 
       Vector<Integer>  vector = new Vector<Integer> (100); 
 
        for (int i = 0; i < 125; i++)
 
               {
 
               al.add(i);
 
               vector.add(i);
 
             }
 
       System.out.println("Array List  : Size =  "+ al.size() + " Capacity = "+  findCapacity(al));
 
       System.out.println("Vector  : Size =  "+ vector.size() + " Capacity = "+  vector.capacity());
 
    }
 
     //returns capacity of an ArrayList
 
  static int findCapacity(ArrayList<Integer> al) throws Exception {
 
        Field field = ArrayList.class.getDeclaredField("elementData");
 
        field.setAccessible(true);
 
        return ((Object[]) field.get(al)).length;
    
}
    
}

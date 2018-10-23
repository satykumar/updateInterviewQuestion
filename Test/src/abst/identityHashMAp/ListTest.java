package abst.identityHashMAp;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
public static void main(String[] args) {
    
    
    List al=new ArrayList<>();
   al.add(12);
   al.add(2);
   al.add(1);
   al.add(13);
   al.add(14);
   al.add(15);
   al.add(16);
   al.add(17);
   
   System.out.println(al.size());
   System.out.println(al.remove(1));
  al.clear();
   System.out.println(al.size());
   System.out.println( al.isEmpty());
   
  
   
   
}
}

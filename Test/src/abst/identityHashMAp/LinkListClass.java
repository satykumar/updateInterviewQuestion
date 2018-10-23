package abst.identityHashMAp;

import java.util.LinkedList;
import java.util.List;

public class LinkListClass {
    
    public static void main(String[] args){
        
        List al=new LinkedList<>();
        al.add(12);
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(7);
        al.add(18);
        
   System.out.println( al.size());
        
       System.out.println( al.remove(1));
        al.isEmpty();
        al.add(2, "shweta");
        System.out.println(al);
        
        
        
    }

    }

package string.mutable;

import java.util.ArrayList;

public class MainTest {
public static void main(String[] args) {
    Coures c=  new Coures();
  c.setName("c");
  ArrayList<Coures> ac= new ArrayList<>();
  ac.add(c);
  Address aa= new Address();
  aa.setId(1);
    Student s=new Student("a", "b", aa);
    System.out.println("immutabelke"+s);
    aa.setId(2);
    c.setName("d");
    

  //  Student s1=new Student("a", "b", aa,ac);
    System.out.println("hhhhhhhhhhhhhhhhhh");
    System.out.println(s.getAddres().getId());
    System.out.println(s);
  //  System.out.println(s.getCoures().get(0).getName());
  
}
}

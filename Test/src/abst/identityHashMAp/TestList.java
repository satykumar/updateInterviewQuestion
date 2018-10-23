package abst.identityHashMAp;

import abs.object.clonee.Employee;

public class TestList {
public static void main(String[] args) {
    
    final Employee e = new Employee();
    e.setName("name");
    e.setName("name");
    
   // e=null; //The final local variable e cannot be assigned. It must be blank and not using a compound assignment
   Employee e1 = new Employee();
 //  e=e1;//The final local variable e cannot be assigned. It must be blank and not using a compound assignment
   
}
static void m(Double d, Integer i){
    System.out.println("HIii");
}
static void m(Integer d, Double i){
    System.out.println("HIii");
}
}

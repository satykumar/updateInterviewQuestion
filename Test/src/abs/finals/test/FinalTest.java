package abs.finals.test;

public class FinalTest {
   // final int i=null; //Type mismatch: cannot convert from null to int
     int a=10; // if we initalize with null final variable then it will give us error // Type mismatch: cannot convert from null to int
 //   final String d=null;
  //  final int b; //The blank final field b may not have been initialized
    
    final int b;
    Integer a1=20;
  //  Integer i1= new Integer(a):
    
    // all wraper class are final
    public FinalTest() {
        b=10;
    }
    
    
public static void main(String[] args) {
    final Employee emp= new Employee();
    
   // emp.setlName("lname");
    emp.setlName("kname");
   // emp=null;
    
    final Employee emp1= new Employee("abc","bcd");
    emp1.setlName("lll");
 //   emp1=null;//The final local variable emp1 cannot be assigned. It must be blank and not using a compound assignment
   
    final String s = new String();
   // s="abc";
 final String  s1="abc";
// s1="222";
}
}

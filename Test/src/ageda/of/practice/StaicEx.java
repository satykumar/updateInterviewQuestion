package ageda.of.practice;

public class StaicEx {
    static {
       System.out.println("hiiiiiiii"); 
       System.out.println(1/0);
      /* try{System.out.println(1/0);
       }
       catch(Exception e){
           System.out.println("hellllllllllllll");
           e.printStackTrace();
           */
     //  }
       // throw new ArithmeticException();
    }
public static void main(String[] args) {
   new StaicEx();
    m();
}
static void m(){
    System.out.println("TTTTTTTTTT");
}
}

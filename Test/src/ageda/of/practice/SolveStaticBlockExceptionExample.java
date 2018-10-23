package ageda.of.practice;

public class SolveStaticBlockExceptionExample {
    public static void main(String[] args) {
        try {
             new A(); // It will throw java.lang.ExceptionInInitializerError
        } catch (Exception error) {
             error.printStackTrace();
        }
    }
  }
   
  class A {
    static { // static block of class, which will throw RuntimeException
        System.out.println("In static block of class A");
        try{        System.out.println(1 / 0);
        }
        // It will throw java.lang.ArithmeticException
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
   
    /* Constructor of class A will never get executed */
    A() {
         System.out.println("In constructor of class A");
    }
}

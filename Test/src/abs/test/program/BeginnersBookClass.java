package abs.test.program;

public class BeginnersBookClass {
    public static void main(String args[]) {
        // lambda expression
        BeginnersBookClass obj= new BeginnersBookClass();
     //   MyFunctionalInterface t =    obj::
        MyFunctionalInterface sum = (a, b) -> a + b;
        System.out.println("Result: "+sum.addMethod(12, 100));
    }
}

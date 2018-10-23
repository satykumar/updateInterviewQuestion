package ageda.of.practice;

public class StaackOverFlowException {

    public static void main(String[] args) {
        m1();
    }
    static void m1(){
       m2(); 
    }
    static void m2(){
        m1();
    }
}

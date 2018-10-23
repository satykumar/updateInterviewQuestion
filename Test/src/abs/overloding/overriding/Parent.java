package abs.overloding.overriding;

public class Parent {

    public Parent() {
        System.out.println("Parent-class-constructor");
    }
    static{
        System.out.println("Parent static block code. ");
    }
    {
        System.out.println("Parent Instant block code. ");
    }
    {
        System.out.println("instant block");
    }
    private void test(){
        System.out.println("parent test method");
    }
     void test1(){
         System.out.println("defalut method");
     }
     protected void test2(){
         System.out.println("protected- method");
     }
     
     public void m(){
         System.out.println("parent m method");
     }
     protected void n(){
         System.out.println("parent n method");
     }
     public void testfinal(final int a){
         System.out.println(a);
     }
     public void t(final  int i){
         
     }
    /* public void teststatic(static int a){
         System.out.println(a);
     }*/ //Illegal modifier for parameter a; only final is permitted
}

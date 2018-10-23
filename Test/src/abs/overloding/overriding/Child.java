package abs.overloding.overriding;

public class Child extends Parent{

    public Child() {
        System.out.println("Child-class-constructor");
    }
    static{
        System.out.println("Child-static block code. ");
    }
  
    {
        System.out.println("Child Instant block code. ");
    }
   public  void test1(){
         System.out.println("Child-defalut method");
     }
     public void test2(){
         System.out.println("Child-protected- method");
     }
     
     public void c(){
         System.out.println("chaild-method c");
     }
     
     public void d(){
         System.out.println("chaild-method d");
     }
     private void test(){
         
     }
}

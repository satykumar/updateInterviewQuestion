package abs.overloding.overriding;

public class OverridingMain {
    
public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println("parent class object :");
        p.test1();
        p.test2();
        p.m();
        p.n();

        Parent pc = new Child();
        System.out.println("parent class reference :");
        pc.m();
        pc.test1();
        pc.test2();
        pc.n();
     
      
        // pc.c(); compile time error //The method c() is undefined for the type
        // Parent this method is present in parent class not in child class

        
      /*  o/p:
            Parent static block code. 
            Child-static block code. 
            Parent Instant block code. 
            Parent-class-constructor
            Child Instant block code. 
            Child-class-constructor
            parent class reference :
            parent m method
            Child-defalut method
            Child-protected- method
            parent n method*/
        

        Child c = new Child();
        System.out.println("Child class object :");
        c.c();
        c.d();
        c.m();
        c.n();
        
        c.test1();
        c.test2();
        c.testfinal(1); //is-a relation ship
       /* o/p:
            Parent static block code. 
            Child-static block code. 
            Parent Instant block code. 
            Parent-class-constructor
            Child Instant block code. 
            Child-class-constructor
            Child class object :
            chaild-method c
            chaild-method d
            parent m method
            parent n method
            Child-defalut method
            Child-protected- method*/
    }
}

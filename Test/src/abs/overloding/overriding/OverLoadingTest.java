package abs.overloding.overriding;

public class OverLoadingTest {
    
public static void main(String[] args) {
    OverLoadingTest ot= new OverLoadingTest();
        ot.m("0");
}

/*public void m(Integer i){
    System.out.println("integer");
}
public void m(Object i){
    System.out.println("Object");
}*/
public void m(String i){
    System.out.println("String");
}
public void m(StringBuffer i){
    System.out.println("StringBuffer");
}

public void m(StringBuilder i){
    System.out.println("StringBuilder");
}
public void m(Exception i){
    System.out.println("Exception");
}
}

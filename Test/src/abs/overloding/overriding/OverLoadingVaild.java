package abs.overloding.overriding;

public class OverLoadingVaild {
public static void main(String[] args) {
   System.out.println(add(1,2) );
}

static int add(int a, int b){return a+b;}  
static double add(double a, double b){return a+b;}  
}

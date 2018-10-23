package abs.overloding.overriding;

public class OverLodingTypePromotion {
    void sum(Integer a,Double b){System.out.println("a method invoked");}  
    void sum(Double a,Integer b){System.out.println("b method invoked");}  
    
    public static void main(String args[]){  
        OverLodingTypePromotion obj=new OverLodingTypePromotion();  
   // obj.sum(20,20);//now ambiguity  
}
}
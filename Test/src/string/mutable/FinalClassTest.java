package string.mutable;

import java.util.ArrayList;
import java.util.List;

public class FinalClassTest {
public static void main(String[] args) {
   /* List<Integer> al = new ArrayList<>();
    al.add(1);
    al=new ArrayList<>();*/
    
  final  List<Integer> al = new ArrayList<>();
    al.add(1);
   // al=new ArrayList<>();//The final local variable al cannot be assigned. It must be blank and not using a compound assignment
}
}

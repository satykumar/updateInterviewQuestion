package interfac.test;

import java.util.HashMap;

public class EachCharCountInString {
public static void main(String[] args) {
    characterCount("hararfiramm");
/* long ins=   Stream.of("harairraama").count();
 System.out.println(ins);*/
   // IntStream.of(values)
}
static void characterCount(String inputString){
    HashMap<Character, Integer> charCount= new HashMap<>();
 char [] carstring=   inputString.toCharArray();
 for (char c : carstring) {
  if(charCount.containsKey(c))  {
      charCount.put(c ,charCount.get(c)+1);
  }
  charCount.put(c ,1);  
}
 System.out.println(charCount);
}

}

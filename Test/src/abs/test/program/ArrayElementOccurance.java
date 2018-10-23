package abs.test.program;

import java.util.HashMap;

public class ArrayElementOccurance {

    public static void main(String[] args) {
        arrayElementCoun(new int[]{4, 5, 4, 5, 4, 6,7,8,9,0,0,7,3,5,4,0,9});
        
    }
    static void arrayElementCoun(int inputArray[]){
        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();
        for (int num : inputArray) {
            if(elementCountMap.containsKey(num)){
                elementCountMap.put(num, elementCountMap.get(num)+1);
            }
            else{
                elementCountMap.put(num, 1);
            }
        }
     //   System.out.println("Input Array : "+Arrays.toString(inputArray));
        
        System.out.println("Element Count : "+elementCountMap);
         
        System.out.println("=======================================");
    }
}

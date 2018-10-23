package string.test;

public class StringFindTheFirstNonRepeatableCharacter {
    public static void main(String[] args) {
        
        String s= "zzzzzbbbccccddehhhhiii";
        s="aabc";
        s="abcadefgegi";
        char ch[]=s.toCharArray();
        
        char currentCh=ch[0];
        int currentChCount=1;
        for(int i=1; i<ch.length;i++){ //start from 1st pos, not oth
               if(currentCh == ch[i]){ //Means its repeated // Ex - a after a
                     currentChCount++;
               }
               else if(currentChCount==1){ //Means it was NonRepeatableCharacter   // Ex - c after b
                   System.out.println("NonRepeatableCharacter = "+currentCh);
                     currentCh=ch[i];
                     currentChCount=1;
               }
               else{ //currentChCount>1 //It was a repeated Ex - b after aa
                     currentCh=ch[i];
                     currentChCount=1;
               }
        }
        if(currentChCount==1){//Check for last character
               System.out.println("Last NonRepeatableCharacter = "+currentCh);
        }
  }
}

package string.mutable;

public class StringPoolTest {
    public static void main(String[] args) {
        
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = new String("abc");
        
        String s5 = new String("abc").intern();
        String s6= new String("cde");
       String s7=s6;
System.out.println("hashcode of s2 " + s2.hashCode());
System.out.println("hashcode of s1 " + s1.hashCode());
System.out.println("hashcode of s3 " + s3.hashCode());
System.out.println("hashcode of s4 " + s4.hashCode());
System.out.println("hashcode of s5 " + s5.hashCode());
System.out.println("hashcode of s4 " + s6.hashCode());
System.out.println("hashcode of s5 " + s7.hashCode());

Integer i= new Integer(10);
Integer io=10;
System.out.println("hashcode of i " + i.hashCode());
System.out.println("hashcode of io " + io.hashCode());

        System.out.println("--comparing s1--");
        System.out.println(s1==s2); //false
        System.out.println(s1==s3); //true
        System.out.println(s1==s4); //false
        System.out.println(s1==s5); //true

        System.out.println("--comparing s2--"); 
        System.out.println(s2==s3); //false
        System.out.println(s2==s4); //false
        System.out.println(s2==s5); //false
        

        System.out.println("--comparing s3--");
        System.out.println(s3==s4); //false
        System.out.println(s3==s5); //true
        

        System.out.println("--comparing s4--");
        System.out.println(s4==s5); //false
        
        String s8="ab";
        System.out.println(s8.concat("cd"));
        System.out.println(s8);
        String k="10";
        int i1=10;
        String sInt=k.valueOf(i);
        System.out.println(sInt);
        
}
}

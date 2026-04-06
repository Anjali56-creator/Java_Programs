package string;

public class basic {
    public static void main(String[] args) {
       
         String s1="Hello";
         String s2="Hello";
         System.out.println(s1==s2); // true because both s1 and s2 refer to the same string literal in the string pool
         String s3=new String("World");
         String s4=new String("World");
         System.out.println(s3==s4); // false because s3 and s4 refer to different objects in the heap
    }
}

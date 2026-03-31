public class equals {
   public static void main(String[] args) {
    student s1=new student();
    s1.age=20;
    s1.name="Anjali";
    student s2=new student();
    s2.age=20;
    s2.name="Anjali";
    System.out.println(s1.equals(s2));
   } 
} // equals method of object class compares the reference of s1 and s2
//even though the content of s1 and s2 is same but they are different objects in memory so it will return false
class student{
    int age;
    String name;
}

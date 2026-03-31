public class getclass {
   public static void main(String[] args) {
    student s1=new student();
    s1.age=20;
    s1.name="Anjali";
    System.out.println(s1.getClass().getName());
    System.out.println(s1 instanceof Object);
   } 
}
class student{
    int age;
    String name;
}

public class toString_method {
    public static void main(String[] args){
        student s1=new student();
        s1.age=20;
        s1.name="Anjali";
        System.out.println(s1); // toString method of object class is called
        System.out.println(s1.toString()); // toString method of object class is called
    }
}
class student{
    int age;
    String name;
}
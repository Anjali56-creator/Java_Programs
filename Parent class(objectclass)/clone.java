public class clone {
    public static void main(String[] args ) throws CloneNotSupportedException {
      student s1=new student();
        s1.age=20;
        s1.name="Anjali";
        student s2=(student) s1.clone();
        System.out.println(s2.age);
        System.out.println(s2.name);
    }
}
//clone throws CloneNotSupportedException
//it is protected method in object class
//to use clone method we need to implement Cloneable interface
class student implements Cloneable{
    int age;
    String name;
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

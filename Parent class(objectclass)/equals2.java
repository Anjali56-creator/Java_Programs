import java.util.Objects;

public class equals2 {
    public static void main(String[] args) {
        student s1=new student();
        s1.age=20;
        s1.name="Anjali";
        student s2=new student();
        s2.age=20;
        s2.name="Anjali";
        System.out.println(s1.equals(s2)); // equals method of student class is called
    }
}
class student{
    int age;
    String name;
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;// this is used to check whether the reference of this and obj are same or not
        }
         if(obj == null){
            return false;//it will handle null pointer exception
        } // getClass() method of object class is used to check whether the class of obj and this are same or not
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        student s = (student) obj; // downcasting
        return this.age == s.age && Objects.equals(this.name, s.name);
    }
}

public class tostring2 {
    public static void main(String[] args) {
        student s1=new student();
        s1.age=20;
        s1.name="Anjali";
        System.out.println(s1);        
    }
}
class student{
    int age;
    String name;
    @Override
    public String toString() {
        return "Name=" + name + " age=" + age;
    }
}


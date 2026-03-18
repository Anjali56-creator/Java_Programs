public class constructor {
    public static void main(String[] args) {
       Student s1 = new Student( "John", 20, 101, "ABC University");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollno);
        System.out.println(s1.college);
        
    }
}
class Student{
    String name;
    int age;
    int rollno;
    String college;
    Student(){
// default constructor
    }
    Student(String name, int age, int rollno, String college){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
        this.college=college;
    }
}

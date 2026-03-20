public class staticBlock {
    public static void main(String[] args){
        Student s1=new Student("Anjali",20,195);
        Student s2=new Student("Anshul",21,196);
       // Student.college="Abes Engineering College";
        System.out.println(s1.name+" "+s1.age+" "+s1.rollno+" "+Student.college);
        System.out.println(s2.name+" "+s2.age+" "+s2.rollno+" "+Student.college);

    }
}
class Student{
    String name;
    int age;
    int rollno;
    static String college;
    Student(String name,int age,int rollno){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
    }
    //static block
    static{
        college="Abes Engineering College";
    }

}

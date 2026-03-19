public class constructorChaining {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student("John");
        student s3=new student("John", 20);
        student s4=new student("John", 101, 20);
        student s5=new student("John", 20, 101, "ABC University");
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollno);
        System.out.println(s1.college);
        // System.out.println(s2.name);
        // System.out.println(s2.age);
        // System.out.println(s2.rollno);
        // System.out.println(s2.college);
        // System.out.println(s3.name);
        // System.out.println(s3.age);
        // System.out.println(s3.rollno);
        // System.out.println(s3.college);
        // System.out.println(s4.name);
        // System.out.println(s4.age);
        // System.out.println(s4.rollno);
        // System.out.println(s4.college);
        // System.out.println(s5.name);
        // System.out.println(s5.age);
        // System.out.println(s5.rollno);
        // System.out.println(s5.college);

    }

}
class student{
    String name;
    int age;
    int rollno;
    String college;
    student(){
        this("unknown",0,0,"unknown");
    }
    student(String name){
        this(name,0,0,null);
    }
    student(String name, int age){
        this(name,age,0,null);
    }
    student(String name, int rollno, int age){
        this(name,age,rollno,null);
    }
    student(String name, int age, int rollno, String college){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
        this.college=college;
    }
}

public class simpleInheritance {
    public static void main(String[] args) {
        Engineeringstudent s1=new Engineeringstudent();
        s1.display();
        s1.attendence();
        student s2=new student();
        s2.display();
        //s2.attendence(); // this will give error because student class does not have attendence method
    }
}
class student{
    String name;
    int rollno;
    public void display(){
        System.out.println("hii i am student");
    }
}
class Engineeringstudent extends student{
    void attendence(){
        System.out.println("i am attending class");
    }
}

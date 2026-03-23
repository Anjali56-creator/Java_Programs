public class HierachicalInheritance {
    public static void main(String[] args) {
        Engineeringstudent s1 = new Engineeringstudent();
        s1.display();
        s1.attendence();
        Computerstudent s2 = new Computerstudent();
        s2.display();
        s2.programming();
        student s3 = new student();
        s3.display();
        //s3.attendence(); // this will give error because student class does not have attendence method
        //s3.programming(); // this will give error because student class does not have programming method
        

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
class Computerstudent extends student{
    void programming(){
        System.out.println("i am learning programming");
    }
}

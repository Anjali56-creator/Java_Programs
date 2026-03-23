public class Multi_level_inheritance {
    public static void main(String[] args) {
        Computerstudent s1=new Computerstudent();
        s1.display();
        s1.attendence();
        s1.programming();
        Engineeringstudent s2=new Engineeringstudent();
        s2.display();
        s2.attendence();
        //s2.programming(); // this will give error because Engineeringstudent class does not have
        // programming method
        student s3=new student();
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
class Computerstudent extends Engineeringstudent{
    void programming(){
        System.out.println("i am learning programming");
    }
}
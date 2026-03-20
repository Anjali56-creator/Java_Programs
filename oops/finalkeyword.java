public class finalkeyword {
    public static void main(String[] args) {
        final int a = 10;
        //a=20; //error: cannot assign a value to final variable a
        System.out.println("Value of a: " + a);

        final Student s1 = new Student("Anjali", 20, 195);
        //s1 = new Student("Anshul", 21, 196); //error: cannot assign a value to final variable s1
        System.out.println(s1.name + " " + s1.age + " " + s1.rollno);
    }
}
class Student{
    String name;
    int age;
    int rollno;
    Student(String name,int age,int rollno){
        this.name=name;
        this.age=age;
        this.rollno=rollno;
    }
}
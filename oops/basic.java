package oops;

import immutable.Student;

public class basic {
    public static void main(String[] args) {
       Student s1=new Student();
       Student s2=new Student();
       s1.name="Anjali";
       s1.age=20;
       s1.rollno=101;
       s1.college="XYZ University";
       s2.name="Rahul";
       s2.age=22;
       s2.rollno=102;
       s2.college="ABC University";
       s1.mark();
       s2.mark();
       s1.print();
       s2.print();

    }
}
class Student{
    String name;
    int age;
    int rollno;
    String college;
    void mark(){
        System.out.println("Marked attendence"+name);
    }
    void print(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No: "+rollno);
        System.out.println("College: "+college);
    }
}

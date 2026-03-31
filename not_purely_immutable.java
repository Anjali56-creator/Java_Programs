public class not_purely_immutable {
    public static void main(String[] args) {
        
        College college = new College("IIT G", "Assam");

        Student s1 = new Student(28, "Anjali", college);

        System.out.println(s1.getCollege().name); // IIT G

        s1.getCollege().name = "IIT B";

        System.out.println(s1.getCollege().name); // IIT B
        

    }
}

// (N0t purely immutable)
final class Student {
    private final int age;
    private final String name;
    private final College college;

    Student(int age, String name, College college) {
        this.age = age;
        this.name = name;
        this.college = college;
    }

    // getters
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public College getCollege() {
        return this.college;
    }
}

// Mutable
class College {
    String name;
    String address;

    College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
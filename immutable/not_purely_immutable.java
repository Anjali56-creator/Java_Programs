package immutable;
public class not_purely_immutable {
    public static void main(String[] args) {
        
        College college = new College("IIT G", "Assam");

        Student s1 = new Student(28, "Anjali", college);

        System.out.println(s1.getCollege().name); // IIT G
        System.out.println(s1.getCollege().address); // Assam
        s1.getCollege().name = "IIT B";
        s1.getCollege().address = "Bangalore";

        System.out.println(s1.getCollege().name); // IIT B
        System.out.println(s1.getCollege().address); // Bangalore
        

    }

            // Not purely immutable because it stores and returns a mutable reference.
            static final class Student {
                private final int age;
                private final String name;
                private final College college;

                Student(int age, String name, College college) {
                    this.age = age;
                    this.name = name;
                    this.college = college;
                }

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

            static class College {
                String name;
                String address;

                College(String name, String address) {
                    this.name = name;
                    this.address = address;
                }
            }
}

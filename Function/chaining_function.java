package Function;

public class chaining_function {
    public static void main(String[] args) {
        fun1();
        System.out.println("bye");
    }
    static void fun1(){
        fun2();
        System.out.println("hi");
    }
    static void fun2(){
        fun3();
        System.out.println("hello");
    }
    static void fun3(){
        System.out.println("welcome");
    }
}

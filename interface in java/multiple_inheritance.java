public class multiple_inheritance {
        public static void main(String[] args) {
            C obj = new C();
            obj.fun();  // Output: fun method
            obj.fun2(); // Output: fun2 method
        
    }
}

// Multiple Inheritance --> Interfaces

interface A {
    void fun();
}

interface B {
    void fun2();
}

class C implements A, B {
    @Override
    public void fun() {
        System.out.println("fun method");
    }

    @Override
    public void fun2() {
        System.out.println("fun2 method");
    }
}


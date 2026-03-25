//final methods cannot be overridden
public class polymorphism3 {
    public static void main(String[] args) {
        A a=new A();
        a.fun(); 
    }
}
class A{
    final void fun(){
        System.out.println("fun in class A");
    }
}
class B extends A{
    //void fun(){  it will give error because final methods cannot be overridden
    //    System.out.println("fun in class B");
    //}
}

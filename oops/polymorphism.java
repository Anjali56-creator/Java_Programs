public class polymorphism {
   public static void main(String[] args) {
    //A a=new B();
    //a.fun(); it will print fun in class A because static methods are hidden not overridden aur agar overriding hota to fun in class B print hota
   } 
}
//static-->they belong to class not object
//static methods are hidden not overridden
class A{
    static void fun(){
        System.out.println("fun in class A");
    }
}
class B extends A{
    static void fun(){
        System.out.println("fun in class B");
    }
}

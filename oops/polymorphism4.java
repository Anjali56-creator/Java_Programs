//fields/variables cannot be overridden
public class polymorphism4 {
    public static void main(String[] args) {
        C c=new D();
        System.out.println(c.x); //it will print 10 because fields/variables cannot be overridden aur agar overriding hota to 20 print hota
        A a=new B();
        System.out.println(a.getx()); //it will print 20 because methods can be overridden aur agar overriding nahi hota to 10 print hota
    }
}
class A{
    int getx(){
        return 10;
    }
}
class B extends A{
    int getx(){
        return 20;
    }
}
class C{
    int x=30;
}
class D extends C{
    int x=40;
}


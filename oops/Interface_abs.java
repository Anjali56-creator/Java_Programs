public class Interface_abs {
    public static void main(String[] args){
        dog d=new dog();
        d.sound();
        d.eat();
        cat c=new cat();
        c.sound();
        c.eat();
    }
}
interface Animal{
    void sound();
    void eat();
}
class dog implements Animal{
    public void sound(){
        System.out.println("Dog makes bark sound");
    }
    public void eat(){
        System.out.println("Dog eats dog food");
    }
}
class cat implements Animal{
    public void sound(){
        System.out.println("Cat makes meow sound");
    }
    public void eat(){
        System.out.println("Cat eats cat food");
    }
}


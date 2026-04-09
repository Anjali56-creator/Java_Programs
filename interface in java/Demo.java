public class Demo {
    public static void main(String[] args) {
        Dog d = new StreetDog();
        d.eat(); // Eating
    }
}

// Interface inheritance
interface Animal {
    void eat();
} 

interface Dog extends Animal {
    void bark();
}

class StreetDog implements Dog {
    
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void bark() {
        System.out.println("Barking");
    }
} 

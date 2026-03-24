public class Abstraction {
public static void main(String[] args) {
    car car=new electriccar();
    car.start();
    car.accelerate();
    car.brake();
    car car1=new fuelcar();
    car1.start();
    car1.accelerate();
    car1.brake();    
}
}
abstract class car{
    void start(){
        System.out.println("car is starting");
    }
    abstract void accelerate();
   abstract void brake();
}
class fuelcar extends car{
    void accelerate(){
        System.out.println("fuel car is accelerating");
    }
    void brake(){
        System.out.println("fuel car is braking");
    }

}
class electriccar extends car{
    void accelerate(){
        System.out.println("electric car is accelerating");
    }
    void brake(){
        System.out.println("electric car is braking");
    }

}
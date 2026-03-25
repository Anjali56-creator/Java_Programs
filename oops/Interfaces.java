public class Interfaces{
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
interface car{
    void start();
    void accelerate();
    void brake();
}
class fuelcar implements car{
    public void start(){
        System.out.println("fuel car is starting");
    }
    public void accelerate(){
        System.out.println("fuel car is accelerating");
    }
    public void brake(){
        System.out.println("fuel car is braking");
    }
}
class electriccar implements car{
    public void start(){
        System.out.println("electric car is starting");
    }
    public void accelerate(){
        System.out.println("electric car is accelerating");
    }
    public void brake(){
        System.out.println("electric car is braking");
    }
}
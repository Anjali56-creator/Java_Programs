public class polymorphism_interface {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay(); // Output: Paying with credit card
    }
}
//polymorphism
interface Payment{
    void pay();
}
class CreditCardPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying with credit card");
    }
}
class PayPalPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying with PayPal");
    }
}
// this type of polymorphism is called interface polymorphism, where we can use 
// a common interface to refer to different implementations of that interface.
//  In this example, the Payment interface is implemented by both CreditCardPayment 
// and PayPalPayment classes, allowing us to use a Payment reference to call the pay() 
// method, which will execute the appropriate implementation based on the actual object
//  type at runtime. 
//dynamic method of interface polymorphism is achieved through method overriding, 
// where the subclass provides a specific implementation of a method that is already
//  defined in its superclass or interface. In this case, both CreditCardPayment and
//  PayPalPayment classes override the pay() method defined in the Payment interface,
//  allowing for dynamic method dispatch at runtime.

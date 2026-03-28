public class static_nested {
    public static void main(String[] args) {
        outer.inner inner=new outer.inner();
        outer outer=new outer();
        inner.display(outer);
        bankaccount account=new bankaccount();
        double interest=account.getinterest(1000);
        System.out.println("Interest = " + interest);
        
    }
    
}
//class outer{
//     static int x=10;
//     int y=20;
    
//     static class inner{
//         void display(){
//             System.out.println("this is a static nested class");
//             System.out.println("x = " + x);
//             //System.out.println("y = " + y); //cannot access non-static variable y
//         }
//     }
// }
class outer{
     static int x=10;
     int y=20;
    
     static class inner{
         void display(outer outer){
             System.out.println("this is a static nested class");
             System.out.println("x = " + x);
             System.out.println("y = " + outer.y); //can access non-static variable y through outer instance
         }
     }
}
class bankaccount{
    private static class interestcalculator{
        static double calculateinterest(double principal, double rate, int time){
            return (principal * rate * time) / 100;
        }
    }
    public double getinterest(double principal){
        return interestcalculator.calculateinterest(principal, 5.0, 1);
    }
}

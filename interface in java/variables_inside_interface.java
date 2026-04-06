public class variables_inside_interface {
   public static void main(String[] args) {
    System.out.println(Mathconstant.PI); // Output: 3.145926
    System.out.println(Mathconstant.value); // Output: 10
   } 
}
// variables inside interface 
interface Mathconstant{
    double PI=3.145926;
    int value=10;
}


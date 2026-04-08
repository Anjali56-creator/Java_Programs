public class Demo2 {
    public static void main(String[] args) {
       Box<Integer>box=new Box<>();
       box.value=5;
         box.printdouble(); // 5.0
    }
    
}
class Box<T extends Number>
{
    T value;
  public void printdouble(){
    System.out.println(value.doubleValue());
  }
}

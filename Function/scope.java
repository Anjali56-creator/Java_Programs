package Function;

public class scope {
    public static void main(String[] args) {
        int x=2;//local variable
        int y=3;//local variable
        System.out.println(x+y);
        fun(x, y);
    }
    static void fun(int a,int b){
        int sum=a+b;
        System.out.println("The sum is: "+sum);
    }
    
}

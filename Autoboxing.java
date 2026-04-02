public class Autoboxing {
    public static void main(String[] args) {
        int x=10;
        Integer y=x; //autoboxing
        System.out.println(x);
        System.out.println(y);//unboxing
        int z=100;
        Integer w = Integer.valueOf(z);  // manual, old way
        System.out.println(w);
        Integer a=20;//autoboxing
        int b=a;//unboxing
        System.out.println(a);
        System.out.println(b);
    }
    static void printinteger(int x){
        System.out.println(x);
    }
}

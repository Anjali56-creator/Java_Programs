public class comparison {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);   // true 

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);   // false 
        System.out.println(x.equals(y));  // true always safe
    }
}

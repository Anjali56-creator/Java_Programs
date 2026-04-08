public class Demo {
    public static void main(String[] args) {
        Integer y=getResult(23);
        System.out.println(y); // 23
        printpair(20, "Alice");
    }
    public static <T> T getResult(T data){
        return data;
    }
    public static<T,U> void printpair(T first, U second){
        System.out.println(first+" "+second);
    }
}

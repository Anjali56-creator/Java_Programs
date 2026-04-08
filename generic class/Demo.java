// package generic class;

public class Demo {
    public static void main(String[] args) {
        Pair<String> P1=new Pair<>("Hello", "World");
        System.out.println(P1.first); // Hello
        System.out.println(P1.second); // World

    }
    
}
class Pair<T>{
    T first;
    T second;
    Pair(T first, T second){
        this.first=first;
        this.second=second;
    }
}

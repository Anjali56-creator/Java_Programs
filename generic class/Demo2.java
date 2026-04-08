

public class Demo2 {
    public static void main(String[] args) {
        Pair<String,Integer> P1=new Pair<>("Hello", 10);
        System.out.println(P1.first+" "+P1.second); // Hello
        
    }
    
}
class Pair<T,U>{
    T first;
    U second;
    Pair(T first, U second){
        this.first=first;
        this.second=second;
    }
}


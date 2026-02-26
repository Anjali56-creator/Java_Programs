package Loop;
public class prime {
    public static void main(String[] args) {
        int p=8;
        for(int i=2;i<=p;i++){
            if(p%i==0){
                System.out.println("Not prime");
                break;
            }
            if(i==p){
                System.out.println("Prime");
            }
        }
    }
}

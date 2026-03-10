public class basic2 {
    public static void main(String[] args) {
        int rollnum[]=new int[3];
        int x=10;
        for(int i=0;i<rollnum.length;i++){
            rollnum[i]=x;
            x+=10;
        }
        for(int i=0;i<rollnum.length;i++){
            System.out.println(rollnum[i]);
        }
    }
}

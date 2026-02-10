package conditional;

public class if_elseif {
    public static void main(String[] args) {
        int x=7,y=8,z=9;
        if(x>y&&x>z)
            System.out.println(x);
        else if(y>z)
            System.out.println(y);
        else
            System.out.println(z);
    }
    
}

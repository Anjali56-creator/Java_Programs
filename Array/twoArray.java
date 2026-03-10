public class twoArray {
    public static void main(String[] args) {
        int[][] rollnums=new int[3][3];
        rollnums[0][0]=10;
        rollnums[0][1]=20;
        rollnums[0][2]=30;
        rollnums[1][0]=40;
        rollnums[1][1]=50;
        rollnums[1][2]=60;
        rollnums[2][0]=70;
        rollnums[2][1]=80;
        rollnums[2][2]=90;
       for(int row=0;row<rollnums.length;row++){
           for(int col=0;col<rollnums[row].length;col++){
               System.out.print(rollnums[row][col]+" ");
           }
           System.out.println();
       }
    }
}

package Experiment;
 import java.util.Scanner;
public class add_two_matrices {
    public static void main(String[] args){
        int[][] matrixA=new int[3][3];
        int[][] matrixB=new int[3][3];
        int[][] matrivC=new int[3][3];

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of matrix A:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrixA[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of matrix B:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrixB[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrivC[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
        System.out.println("Sum of matrices is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrivC[i][j]+" ");
            }
            System.out.println();
        }

    }
}

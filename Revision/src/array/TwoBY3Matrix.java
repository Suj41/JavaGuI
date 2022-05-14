package array;

import java.util.Scanner;

public class TwoBY3Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=2;
        int col=3;

        int[][] arr= new int [row][col];
        int[][] mat ={{1,2,3},{2,3,4}};
        int[][] mat1 ={{1,2,3},{2,3,4}};
        for (int i=0;i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0;i<row; i++){
            for (int j=0; j<col; j++){
               arr[i][j]=mat[i][j]+mat1[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

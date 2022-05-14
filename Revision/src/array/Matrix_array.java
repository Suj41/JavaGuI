package array;

import java.util.Scanner;

public class Matrix_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row=2;
        int column=3;

        int[][] arr= new int[row][column];
        int[][] arr1=new int[row][column];

        for(int i=0;i< row; i++){
            for (int j=0; j< column; j++){
                System.out.println("Enter value at "+i+" "+j+" ");
                arr[i][j]= sc.nextInt();
            }
        }

        for(int i=0;i< row; i++){
            for (int j=0; j< column; j++){
                System.out.println("Enter value of 2nd matrix at "+i+" "+j+" ");
                arr1[i][j]= sc.nextInt();
            }
        }

        int[][] res= new int[row][column];
        System.out.println("MULTIPLICATION of 1st and 2nd is");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                res[i][j]=arr[i][j]*arr1[i][j];
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

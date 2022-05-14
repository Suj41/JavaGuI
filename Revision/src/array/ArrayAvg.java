package array;

import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i=0; i< arr.length; i++){
            System.out.println("Enter Value:");
            arr[i]= sc.nextInt();
        }
        int sum=0, avg=0;
        for (int i=0; i< arr.length; i++){
        sum=sum+arr[i];

        }avg=sum/2;
        System.out.println("Average is "+avg);
    }
}

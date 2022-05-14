package array;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for(int i=0; i< arr.length; i++){
            System.out.println("Enter Value :");
            arr[i]= sc.nextInt();
        }
        int sum =0;
        for (int i= 0; i<arr.length; i++){
       sum+=arr[i];

        }
        System.out.println(sum);
        }
      //  System.out.println("Sum is :"+sum);
    }


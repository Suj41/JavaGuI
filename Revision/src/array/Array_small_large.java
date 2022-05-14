package array;

import java.util.Scanner;

public class Array_small_large {
    public static void main(String[] args) {
        int[] arr= new int[5];
        Scanner sc= new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int large=arr[0];
        for(int i=0;i< arr.length; i++){
            if(arr[i]>large)
                large=arr[i];
        }
        System.out.println(large);
        System.out.println("for smallest");

        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<smallest)
                smallest=arr[i];


        }
        System.out.println(smallest);

    }

}
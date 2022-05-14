package array;

import java.util.Scanner;

public class ShowEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i =0; i< arr.length; i++){
            System.out.println("Enter Value:");
            arr[i]= sc.nextInt();
        }
        System.out.println("Even numbers are ");
        for (int i=0; i< arr.length; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("ODD numbers are ");
        for (int i=0; i< arr.length; i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}

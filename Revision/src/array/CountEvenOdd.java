package array;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i=0; i< arr.length; i++){
            System.out.print("Enter Value :");
            arr[i]= sc.nextInt();
        }
        int even=0, odd=0;
        for (int i=0; i< arr.length; i++){
        if(arr[i]%2==0){
            even = even +1;
        }
        else {
            odd=odd+1;
        }
        }
        System.out.println("Total Even Numbers are "+even);
        System.out.println("Total Odd Numbers are "+odd);
    }
}

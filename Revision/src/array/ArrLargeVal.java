package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrLargeVal {

        public static int getlargest ( int[] a, int total){
            Arrays.sort(a);
            return a[total - 1];
        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Array Size:");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter Value: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Largest VALUE:" + getlargest(arr, size));
        }

    }



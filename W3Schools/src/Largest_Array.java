import java.util.Scanner;

public class Largest_Array {
    public static void main(String[] args) {
        int[] arr= new int [5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number :");
        for(int i=0; i< arr.length; i++){
           arr[i]= sc.nextInt();
        }
        int h= arr[0];
        System.out.println("Highest Number is :");
        for(int i=0; i< arr.length; i++){
            if (arr[i]>h) {
               h=arr[i];

            }


        }
        System.out.println(h);
    }
}

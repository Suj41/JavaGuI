package array;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array :");
        int size=sc.nextInt();
        int[] arr= new int[size];
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter an element :");
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter value to search:");
        int searchValue = sc.nextInt();
        binarysearch(arr, searchValue);

    }
    public  static void binarysearch(int[] arr, int searchValue)
    {
        boolean flag = false;
        int first=0;
        int last= arr.length-1;
        while (first<=last){
            int mid = (first+last)/2;
            if(arr[mid]==searchValue){
                flag=true;
                break;
            }
            else if (arr[mid]>searchValue){
                last=mid-1;
            } else {
                first=mid+1;
            }
        }
        if (flag)
            System.out.println("Bhetayo");
        else
            System.out.println("Bhetayena");

    }
}

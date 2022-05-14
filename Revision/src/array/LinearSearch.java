package array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of an array :");
        int size =sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter NUmber:");
        for(int i=0; i<arr.length; i++)
        {
             arr[i]= sc.nextInt();
        }
       linear(arr);


    }
    public static void linear(int[] arr){
        Scanner sc = new Scanner(System.in);
        int searchValue;
        System.out.println("Value to search ");
        searchValue= sc.nextInt();
        int index=0;
        boolean flag=false;
        for (int i=0;i<arr.length; i++){
            if(searchValue==arr[i]) {
                flag = true;
                index=i;
                break;
            }

        }
        if(flag){
            System.out.println(searchValue+" is found at "+ index+" index");
        } else{
            System.out.println("Value is not found");
        }

    }
}

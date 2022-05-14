import java.util.Scanner;

public class Linera_search_array {
    public static void main(String[] args) {
        // declares array of an integer
        Scanner sc = new Scanner(System.in);
        int[]  arr;
        //allocating memory for 5 integers
        arr = new int[5];
        System.out.println("Enter a value: ");
        for(int i=0; i<arr.length; i++){
            //arr[i]=i+1;

            arr[i]=sc.nextInt();
            //arr[i]+=i;

        }
        System.out.println("The values are :");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);


        }
        System.out.println("Enter the value to search :");
        int searchValue = sc.nextInt();
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(searchValue==arr[i]) {
                flag = true;
                break;
            }
        }

            if(flag){
                System.out.println("Not found.");
            } else{
                System.out.println("Found.");
            }

        }


    }


import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        // declares array of an integer
        Scanner sc = new Scanner(System.in);

        int[]  arr;
        //allocating memorey for 5 integers
        arr = new int[5];
        System.out.println("Enter a value: ");
        for(int i=0; i<arr.length; i++){
            //arr[i]=i+1;

            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.println("The valiues are- "+ arr[i]);

        }

    }
}

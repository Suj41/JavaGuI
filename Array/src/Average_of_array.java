import java.util.Scanner;

public class Average_of_array {

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
                //arr[i]+=i;

            }
            double sum=0;
            double average=0;
            for(int i=0; i<arr.length; i++) {
               sum +=arr[i];

            }
            average =sum/2;
            System.out.println("the average of number are "+average);


        }



}

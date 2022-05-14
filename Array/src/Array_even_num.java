import java.util.Scanner;

public class Array_even_num {
        public static void main(String[] args) {
            // declares array of an integer
            Scanner sc = new Scanner(System.in);
            int even=0;
            int odd=0;
            int[]  arr;
            //allocating memorey for 5 integers
            arr = new int[5];
            //System.out.println("Enter a value: ");
            for(int i=0; i<arr.length; i++){
                //arr[i]=i+1;

                arr[i]=sc.nextInt();

            }
            System.out.println("The values are: " );
            for(int i=0; i<arr.length; i++){

                if(arr[i]%2==0)
                   even +=1;
                    else
                        odd+=1;
                }
            System.out.println("Number of even number are :"+even);
            System.out.println("Number of odd number are :"+odd);
        }

        }




package methods;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number ");
        int num= sc.nextInt();
       int z=functon(num);
        System.out.println("Factorial of "+num+" is :");
        System.out.println(z);
    }
    public static int functon(int num){
        int fact=1;
        for (int i=num; i>1; i--){
            fact=fact*i;
        }

        return fact;
    }
}

import java.util.Scanner;
public class First_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Data_Representation
        int first, second, result;
        //Input
        System.out.print("Enter first number :");
        first = sc.nextInt();
        System.out.print("Enter second number :");
        second = sc.nextInt();
        //Algorithm
        result = first + second;
        //Output
        System.out.print("Sum is :" + result);
    }
}
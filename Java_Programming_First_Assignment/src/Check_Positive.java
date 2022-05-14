import java.util.Scanner;

public class Check_Positive {
    public static void main(String[] args) {
        Scanner Sujal = new Scanner(System.in);
        double number;
        System.out.print("Enter number : ");
        number = Sujal.nextInt();
        if (number > 0) {
            System.out.print("number is positive. ");
        } else if (number == 0) {
            System.out.print("number is zero. ");
        } else {
            System.out.print("number is negative. ");
        }
    }
}

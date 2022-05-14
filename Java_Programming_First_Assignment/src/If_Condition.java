import java.util.Scanner;
public class If_Condition {
    public static void main(String[] args) {
        Scanner Sujal = new Scanner(System.in);
        double first, second;
        System.out.print("Enter first number :");
        first = Sujal.nextInt();
        System.out.print("Enter second number :");
        second = Sujal.nextInt();
        if (first > second) {
            System.out.print("first is greater than second");
        } else {
            System.out.print("second is greater");
        }
    }
}
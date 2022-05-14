import java.util.Scanner;

public class Number_betn_a_and_b {
    public static void main(String[] args) {
        Scanner Sujal = new Scanner(System.in);
        int number;
        System.out.print("Enter Number :");
        number = Sujal.nextInt();
        if (number > 9 && number < 21)
            System.out.print("yes");
        else {
            System.out.print("no");
        }
    }

}


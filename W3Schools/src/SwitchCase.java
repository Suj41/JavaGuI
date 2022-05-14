import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Office day in week :");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Fuck You!");
        }

    }
}

package caseChange;
import java.util.Scanner;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
public class Tolowercase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        char Str1 = toLowerCase(sc.next().charAt(0));
        System.out.println(Str1);

        System.out.println("Enter Next: ");
        char Str2 = toUpperCase(sc.next().charAt(0));
        System.out.println(Str2);
    }

}

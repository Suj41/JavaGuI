import java.util.Scanner;

public class InsertCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character :");
        char chr = sc.next().charAt(0);
        System.out.println("Entered character is :"+chr);
    }
}

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Number between 0-9:");
        Scanner sc = new Scanner(System.in);
        int fk= sc.nextInt();
        for ( int i=0; fk<10; fk++){
            System.out.println("Fuck You!"+fk);
        }
    }
}

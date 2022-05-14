import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Number between 0-9 :");
        Scanner sc = new Scanner(System.in);
        int fk= sc.nextInt();
        do{
            System.out.println("Fuck You!"+fk);
            fk++;
        }
        while (fk<10);
    }
}

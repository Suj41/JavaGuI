import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Num between 0-9 :");
        int fk= sc.nextInt();
        while(fk<10){
            System.out.println("Fuck You!"+fk);
            fk++;
        }
        System.out.println("----------");
        String[] cars = {"Ford", "LandRover", "Audi", "Porshe"};
        cars[2]="Fuck";
        for (String i: cars)
        {
            System.out.println(i);
        }

    }
}

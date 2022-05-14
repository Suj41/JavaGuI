import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner Sujal = new Scanner(System.in);
        int pizza = 200, momo = 300, tea = 20;
        int pizza_quantity, momo_quantity, tea_quantity;
        float grand_total, vat, total;
        System.out.println("-------WELCOME TO OUR TODO CAFE-------");
        System.out.println("---------- CAFE MENU ----------");
        System.out.println("");
        System.out.println("");
        System.out.print("Pizza Quantity :");
        pizza_quantity = Sujal.nextInt();
        System.out.print("Momo :");
        momo_quantity = Sujal.nextInt();
        System.out.print("Tea :");
        tea_quantity = Sujal.nextInt();
        total = pizza_quantity * pizza + momo_quantity * momo + tea_quantity * tea;
        vat = (total * 13) / 100;
        System.out.println("Vat : Rs." + vat);
        grand_total = total + vat;
        System.out.println("Grand Total : Rs." + grand_total);
    }
}

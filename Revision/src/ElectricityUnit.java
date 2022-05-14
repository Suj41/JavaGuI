import java.util.Scanner;

public class ElectricityUnit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Household electricity in unit: ");
        int unit= sc.nextInt();
        float price, total;
        float bill;
        if(unit<=50){
            price=0.5f;
            total=price*unit;
            bill=total+0.2f*total;
            System.out.println("Total electricity bill of a household is Rs."+bill);

        }
        else if(unit<=150){
            price=0.75f;
            total=price*unit;
            bill=total+0.2f*total;
            System.out.println("Total electricity bill of a household is Rs."+bill);
        }
        else if(unit<=250){
            price=1.20f;
            total=price*unit;
            bill=total+0.2f*total;
            System.out.println("Total electricity bill of a household is Rs."+bill);
        }
        else {
            price=1.5f;
            total=price*unit;
            bill=total+0.2f*total;
            System.out.println("Total electricity bill of a household is Rs."+bill);
        }
    }
}

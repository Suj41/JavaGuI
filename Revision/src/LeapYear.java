import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Year:");
        int year = Sc.nextInt();
        if(year%4==0){
            System.out.println(year+" is leap year.");
        }else {
            System.out.println(year+" is not a leap year.");
        }
    }
}

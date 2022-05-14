import java.util.Scanner;
public class Java_Programming_Assignment {
    public static void main(String[] args){
        Scanner Sujal = new Scanner(System.in);
        int principal, time, rate;
        int interest;
        System.out.print("Enter Principal : Rs ");
        principal= Sujal.nextInt();
        System.out.print("Enter Time :");
        time= Sujal.nextInt();
        System.out.print("Enter Rate :");
        rate = Sujal.nextInt();
        interest = (principal*rate*time)/100;
        System.out.print("The Interest is :"+ interest+"%");


    }

}

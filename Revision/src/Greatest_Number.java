import java.util.Scanner;

public class Greatest_Number {
    public static void main(String[] args) {
        System.out.println("Enter the value of A :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the value of B: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of C :");
        int c = sc.nextInt();
        System.out.println(" ");
        System.out.println("For A and B ONLY:");
        System.out.println("-----------");
        //Using Math.max()
        System.out.println("The Greatest Number is:"+Math.max(a,b));
        System.out.println("--------");
        //Using if statement
        if(a>b){
            System.out.println("A is greater Number.");
        }else{
            System.out.println("B is greater Number.");
        }
        System.out.println("-----------");

        System.out.println("For A, B and C");
        if(a>b&&a>c){
            System.out.println("A is greatest.");
        }else if(b>a && b>c){
            System.out.println("B is greater.");
        }
        else {
            System.out.println("C is greatest.");
        }

    }
}

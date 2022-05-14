import java.util.Scanner;

public class Simple_Interest_func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Principal ");
        int p= sc.nextInt();
        System.out.println(" Time ");
        int t= sc.nextInt();
        System.out.println(" Rate");
        int r= sc.nextInt();
        int getReturn= function(p,t,r);
        System.out.println("Simple Interest "+getReturn);
    }
    public static int function(int p, int t, int r){
        int result=p*t*r;
        return result;
    }
}

import java.util.Scanner;

public class add_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A");
        int a= sc.nextInt();
        System.out.println("Enter B");
        int b= sc.nextInt();
        System.out.println("Enter C");
        int c= sc.nextInt();
        int get= returntype(a, b, c);
        System.out.println("Get is "+get);
    }
public static int returntype(int a, int b , int c){

        return a+b+c;

}
}

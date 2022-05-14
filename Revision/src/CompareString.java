import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2= sc.next();
        //equals only check string case too.
        if(str1.equals(str2)){
            System.out.println("str1 equals to str2.");

        }else{
            System.out.println("str1 is not equals to str2.");
        }

        String str3= sc.next();
        String str4 = sc.next();
        //equals with IgnoreCase check only string not its case.
        if(str3.equalsIgnoreCase(str4)){
            System.out.println("str3 equals to str4.");

        }else{
            System.out.println("str3 is not equals to str4.");
        }
    }
}

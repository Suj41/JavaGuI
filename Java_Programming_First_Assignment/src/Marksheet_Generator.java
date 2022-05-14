import java.util.Scanner;
public class Marksheet_Generator {
    public static void main(String[] args) {
        Scanner Sujal = new Scanner(System.in);
        String name;
        double OOP, Database, Web, Probability, percentage;

        System.out.print("Enter name :");
        name = Sujal.nextLine();
        System.out.print("Marks of OOP :");
        OOP = Sujal.nextInt();
        System.out.print("Marks of Database :");
        Database = Sujal.nextInt();
        System.out.print("Marks of Web :");
        Web = Sujal.nextInt();
        System.out.print("Marks of Probability :");
        Probability = Sujal.nextInt();
        percentage =(OOP+Database+Web+Probability)/4;
        System.out.println("The marks is :"+percentage+"%");
        if(percentage>=40){
            System.out.println( name+" is pass.");
        }
        else{
            System.out.println(name+" is fail.");
        }
    }
}

import java.util.Scanner;
public class Area_of_Cricle {
    public static void main(String[] args){
        Scanner Sujal = new Scanner(System.in);
        double radius, area;
        System.out.print("Enter Radius of a Cricle in cm : ");
        radius = Sujal.nextInt();
        area = (22*radius*radius)/7;
        System.out.print("Area of a Circle : "+area+ " cm^2");
    }
}

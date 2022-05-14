import java.util.Scanner;
public class Area_of_Triangle {
    public static void main(String[] args){
        Scanner sujal = new Scanner(System.in);
        int height, base, area;
        System.out.print("Enter Height of a Triangle in cm :");
        height = sujal.nextInt();
        System.out.print("Enter Base of a Triangle in cm :");
        base = sujal.nextInt();
        area = (height*base)/2;
        System.out.print("Area of a Triangle :"+area+"cm^2");
    }
}

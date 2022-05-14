import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks in Maths: ");
        int maths = sc.nextInt();
        System.out.println("Marks in English: ");
        int eng = sc.nextInt();
        System.out.println("Marks in Nepali: ");
        int nep = sc.nextInt();
        System.out.println("Marks in Science: ");
        int sci = sc.nextInt();
        System.out.println("Marks in Social: ");
        int sos = sc.nextInt();
        int sum;
        sum= maths+eng+nep+sci+sos;
        int total=500;
        int avg = sum/5;
        System.out.println("Total Percentage is:"+avg+"%");
        if(avg>=90){
            System.out.println("Student Secured A GRADE.");
        } else if(avg>=80){
            System.out.println("Student Secured B GRADE.");
        }else if (avg>=70){
            System.out.println("Student Secured C GRADE.");
        }else if(avg>=60){
            System.out.println("Student Secured D GRADE.");
        } else if (avg>=40){
            System.out.println("Student Secured E GRADE.");
        } else {
            System.out.println("Student Secured F GRADE.");
        }

    }
}

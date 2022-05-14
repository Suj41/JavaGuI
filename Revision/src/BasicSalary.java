import java.util.Scanner;

public class BasicSalary {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Employee Name: ");
        String name = sc.next();
        System.out.println("Employee Salary: ");
        int salary = sc.nextInt();
        float hra, da;
        float grossSal;
        if(salary<=10000){
            hra = salary*0.2f;
            da= salary*0.8f;
            grossSal=salary+hra+da;
            System.out.println("Gross Salary of "+name+" is "+grossSal);
        }
        else if (salary<=20000){
            hra=salary*0.25f;
            da=salary*0.9f;
            grossSal=salary+hra+da;
            System.out.println("Gross Salary of "+name+" is "+grossSal);
        }
        else{
            hra=salary*0.3f;
            da=salary*0.95f;
            grossSal=salary+hra+da;
            System.out.println("Gross Salary of "+name+" is "+grossSal);
        }
    }
}

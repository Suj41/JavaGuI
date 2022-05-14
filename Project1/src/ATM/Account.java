package ATM;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat  moneyFromat = new DecimalFormat("'$'###,##0.00");
    /*Set the Customer Number*/
    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    /*Get the customer number*/
    public int getCustomerNumber(){
        return customerNumber;
    }
    /*Set the pin number */
    public int setPinNumber(int pinNumber){
        this.pinNumber() = pinNumber;
        return pinNumber;
    }
    /*Get the pin number*/
    public int getPinNumber(){
        return pinNumber;
    }
    /*Get Chechking Account Balance*/
    public double getCheckinBalance(){
        return checkingBalance;
    }/*Get saving account balance*/
    public double getSavingBalance(){
        return savingBalance;
    }
    /*Calculte Checking Account Withdrawal*/
    public double calcSavingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    } /*Calculate Saving Account Withdrawal*/
    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    /* Customer Checking Account Withdraw Input*/
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance:"+ moneyFromat.format(checkingBalance()));
        System.out.println("Amount you want to withdraw from checking account: ");
        double amount= input.nextDouble();
        if((chekingBalance - amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance "+ moneyFromat.format(checkingBalance()));
        } else {
            System.out.println(" Balance cannot be negative."+"/n");

        }
    }
/*Customer Saving Account Withdraw Input*/
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance "+ moneyFromat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account ");
        double amount = input.nextDouble();
        if((savingBalance + amount)>=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Saving Account Balance "+ moneyFromat.format(savingBalance));
        } else {
            System.out.println(" Balance cannot be negative."+"/n");

        }

    }
    public int customerNumber;
   public int pinNumber;
    public double chekingBalance=0;
    public double savingBalance=0;
}

package ATM;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;


public class Open_Menu  extends Account {
    Scanner input = new Scanner(System.in);
    int selection;

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(999999, 9999);
                data.put(888888, 8888);
                System.out.println("Welcome to the ATM Project!");

                System.out.println("Enter Your Customer Number: ");
                setCustomerNumber(input.nextInt());


            } catch (Exception e) {
                System.out.println("/n" + "Wrong Customer number or Pin Number." + "/n");

            }
            while (x == 1) ;
        }
        /* Display account type with menu selection */
        public void getAccountType() {
            System.out.println("Select the account you want to access: ");
            System.out.println("Type 1- Checking Account");
            System.out.println("Type 2- Saving Account");
            System.out.println("Type 3- Exist");
            System.out.println("Choice: ");

            selection = input.nextInt();

            switch (selection) {

                case 1:
                    getChecking();
                    break;
                case 2:
                    getSaving();
                    break;

                case 3:
                    System.out.println("Thank You for using this ATM, bye.");
                    break;

                default:
                    System.out.println("/n" + "Invalid Choice." + "/n");

            }
        }
        /*Display Checking Account Menu with Selection*/
        public void getChecking () {
            System.out.println("Checking Account: ");
            System.out.println("Type 1- View Balance");
            System.out.println("Type 2- Withdraw Funds");
            System.out.println("Type 3- Deposit Funds");
            System.out.println("Type 4- Exist");
            System.out.println("Choice: ");

            switch (selection) {
                case 1:
                    System.out.println(" Saving Account " + moneyFormat.format(getSavingBalanceInput));
                    break;
                case 2:
                    getSavingWithdrawInput();
                    getAccountType();
                    break;
                case 3:
                    getSavingDepositInput();
                    getAccountType();
                    break;
                default:
                    System.out.println("/n" + "Invalid Choice." + "/n");
                    getSaving();

            }
        }

        int selection;
    }
}

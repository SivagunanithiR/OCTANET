import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int pin = 1234;

        int Balance = 10000;

        int DepositAmount = 0;

        int WithDrawAmount = 0;

        String name;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your pin number");

        int password = in.nextInt();

        if (password == pin) {
            System.out.println("Enter your name");
            name = in.next();
            System.err.println("Welcome " + name);

            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to Deposit amount");
                System.out.println("Press 3 to Withdraw amount");
                System.out.println("Press 4 to take recipt");
                System.out.println("Press 5 to Exit");

                int opt = in.nextInt();

                switch (opt) {
                    case 1:
                        System.out.println("Your current Balance is " + Balance);
                        break;
                    case 2:
                        System.out.println("How much do you need to Deposit in your Bank account");
                        DepositAmount = in.nextInt();
                        System.out.println("Successfully Deposited");
                        Balance += DepositAmount;
                        break;
                    case 3:
                        System.out.println("How much do you need to Withdraw from your Bank account");
                        WithDrawAmount = in.nextInt();
                        if (Balance < WithDrawAmount) {
                            System.out.println("Insufficient Balance");
                            System.out.println("Try less than your current balance" + Balance);

                        } else {
                            System.out.println("Successfully WithDrawn");
                            Balance = Balance - WithDrawAmount;
                        }
                        break;
                    case 4:
                       System.out.println("Welcome to XYZ ATM");
                       System.out.println("Avalaible Balannce is "+Balance);
                       System.out.println("Amount Deposited "+DepositAmount);
                       System.out.println("Amount Withdrawn "+WithDrawAmount);
                       System.out.println("Thanks for using XYZ ATM");
                       break;
                   
                default :
                System.out.println("Press the number below 5");
                }
                if(opt==5){
                    System.out.println("Thank you");
                    break;
                }
            }
        }
        else{
            System.out.println("Wrong PIN number");

        }

    }
}

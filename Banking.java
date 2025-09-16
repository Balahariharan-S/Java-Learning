import java.util.Scanner;

public class Banking {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 1000;
        boolean isRunning = true;
        int choice;
        while(isRunning) {
            System.out.println("--------------------------");
            System.out.println("WELCOME TO BANK");
            System.out.println("--------------------------");
            System.out.println("1.Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("--------------------------");
            System.out.print("Select an option(1-4): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> Balance(balance);
                case 2 -> balance += Deposit();
                case 3 -> balance -= Withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }
        System.out.println("**************************");
        System.out.println("ThankingYou for Banking with us!");
        System.out.println("**************************");
    }
    static void Balance(double balance){
        System.out.println("--------------------------");
        System.out.printf("$%.2f\n",balance);
    }
    static double Deposit(){
        double amount;
        System.out.println("--------------------------");
        System.out.print("Amount to be Deposited: ");
        amount = sc.nextDouble();
        if(amount<0){
            System.out.println("--------------------------");
            System.out.println("Amount can't be less than zero!");
            return 0;
        }else{
            return amount;
        }
    }
    static double Withdraw(double balance){
        double amount;
        System.out.println("--------------------------");
        System.out.print("Amount to be Withdrawn: ");
        amount = sc.nextDouble();
        if(amount>balance){
            System.out.println("--------------------------");
            System.out.println("Insufficient Balance!");
            return 0;
        }else if(amount<0){
            System.out.println("--------------------------");
            System.out.println("Amount can't be less than zero!");
            return 0;
        }
        else {
            return amount;
        }
    }
}

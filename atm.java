import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        int balance = 5000;
        int amount = 3754;
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}
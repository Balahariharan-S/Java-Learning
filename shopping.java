import java.util.Scanner;
public class shopping {
    public static void main(String[] args) {
        double amount = 1200;
        double discount;
        if (amount > 1000) {
            discount = amount * 10/100;
        } else {
            discount = amount * 5/100;
        }
        double finalAmount = amount - discount;
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Amount to Pay: " + finalAmount);
    }
}
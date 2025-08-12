public class RestaurantBill {
    public static void main(String[] args) {
        String customerName = "Alice";
        double foodBill = 45.75;
        double tipPercentage = 15.0;

        // Calculate tip
        double tip = (tipPercentage / 100) * foodBill;
        double totalBill = foodBill + tip;

        // Display
        System.out.println("Customer: " + customerName);
        System.out.printf("Food Bill: $%.2f%n", foodBill);
        System.out.printf("Tip (%.0f%%): $%.4f%n", tipPercentage, tip);
        System.out.printf("Total Bill: $%.4f%n", totalBill);
    }
}
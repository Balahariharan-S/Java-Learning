import java.util.Scanner;

public class Ticketbooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Tickets: ");
        int tickets = sc.nextInt();
        if(tickets<5 || tickets>40){
            System.out.println("Minimum 5 and Maximum 40 tickets are allowed!");
            return;
        }
        System.out.print("Enter ticket class(K/Q)? ");
        String ticketClass = sc.next();
        double ticketPrice;
        if(ticketClass.equalsIgnoreCase("K")){
            ticketPrice = 75.0;
        }else if(ticketClass.equalsIgnoreCase("Q")){
            ticketPrice = 150.0;
        }else{
            System.out.println("Invalid Class! please choose K/Q.");
            return;
        }
        sc.nextLine();
        System.out.print("Do You have coupon(Yes/No)? ");
        String coupon = sc.nextLine();

        System.out.print("Do You want refreshments(Yes/No)? ");
        String refreshment = sc.nextLine();

        double totalCost = tickets * ticketPrice;

        if(tickets > 20){
            totalCost -= totalCost*0.10;
        }
        if(coupon.equalsIgnoreCase("yes")){
            totalCost -= totalCost*0.02;
        }
        if(refreshment.equalsIgnoreCase("yes")){
            totalCost += tickets*50;
        }
        System.out.println("Final Ticket cost : Rs."+totalCost);
        sc.close();
    }
}

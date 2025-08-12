public class MovieBooking {
    public static void main(String[] args) {
        // Movie booking details
        String movieName = "Inception";
        int ticketsBooked = 3;
        double ticketPrice = 250.0; // price per ticket

        // Calculate total cost
        double totalCost = ticketsBooked * ticketPrice;

        // Print booking details
        System.out.println("Movie: " + movieName);
        System.out.println("Tickets Booked: " + ticketsBooked);
        System.out.println("Total Cost: Rs." + totalCost);
    }
}
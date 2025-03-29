public class Main {
    public static void main(String[] args) {
        //TODO 1: Declare and initialize variable for First Name
        String firstName = "Sandy";
        String lastName = "Jones";
        String userName = firstName + lastName;
        String movieName = "The Source Code";
        int ticketsNumber = 8;
        double price = 10.57;
        double totalPrice = ticketsNumber * price;

        System.out.println("Congratulations!! You have successfully booked the tickets\n");
        //Print Information + Variables Value
        System.out.println("Username: " + userName.toLowerCase());
        System.out.println("Movie: " + movieName.toUpperCase());
        System.out.println("Number of Tickets: " + ticketsNumber);
        System.out.println("Price per ticket: $" + price);
        System.out.println("Total price of "+ ticketsNumber+ " tickets: $" + totalPrice);

        System.out.println("\nThank you for choosing us for booking your movie tickets\nEnjoy the Movie!!!");
    }
}

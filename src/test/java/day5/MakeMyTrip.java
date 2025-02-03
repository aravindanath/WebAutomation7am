package day5;

public class MakeMyTrip extends AirLines {
    public void cancelTicket() {
        System.out.println("Ticket cancelled 80% refund");
    }

    public static void main(String[] args) {
        MakeMyTrip makeMyTrip = new MakeMyTrip();
        makeMyTrip.bookTicket();
        makeMyTrip.cancelTicket();
    }
}

package day5;

public class SkyScanner extends AirLines   {
    @Override
    public void cancelTicket() {
        System.out.println("Ticket cancelled 50% refund");
    }

    public static void main(String[] args) {
        SkyScanner skyScanner = new SkyScanner();
        skyScanner.bookTicket();
        skyScanner.cancelTicket();
    }
}

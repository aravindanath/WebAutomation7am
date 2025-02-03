package day5;

public abstract class AirLines {

    // Non abstract method
    public void bookTicket() {
        System.out.println("Ticket booked");
    }


    // Abstract method
    public abstract void cancelTicket();
}

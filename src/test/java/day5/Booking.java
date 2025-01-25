package day5;

public class Booking {


    /**
     * {
     * "firstname" : "testFirstName",
     * "lastname" : "lastName",
     * "totalprice" : 10.11,
     * "depositpaid" : true,
     * "bookingdates" : {
     * "checkin" : "2022-01-01",
     * "checkout" : "2024-01-01"
     * },
     * "additionalneeds" : "testAdd"
     * }
     */


    String firstName;
    String lastName;
    double totalprice;
    boolean depositpaid;
    String additionalneeds;
    BookingDates bookingdates;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public BookingDates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }

}

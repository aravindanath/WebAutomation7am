package day5;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TestCase {


    public static void main(String[] args) {

        RestAssured.baseURI ="https://restful-booker.herokuapp.com";
        RestAssured.basePath = "/booking";

        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("2024-11-11");
        bookingDates.setCheckout("2025-01-11");

        Booking booking = new Booking();
        booking.setBookingdates(bookingDates);
        booking.setDepositpaid(true);
        booking.setTotalprice(10.44);
        booking.setFirstName("Naveen");
        booking.setLastName("Singh");
        booking.setAdditionalneeds("Testing apis");




        Response response = given().contentType(ContentType.JSON).body(booking).log().all().post();

        response.prettyPrint();

        System.out.println("Response: " + response.getStatusCode());



    }
}

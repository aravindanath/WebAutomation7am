package day4;

import org.openqa.selenium.WebDriver;

public class Exampls {

    String city = "Banglaore";

    public static void main(String[] args) {
//        WebDriver driver = null;
//        new DriverSetup(driver);

        Exampls exampls = new Exampls();
        exampls.register("aadvik");

    }

    public void register(String name){
        System.out.println("Name: " + name);
        this.city ="pune";
        System.out.println("City: " + city);
    }


}

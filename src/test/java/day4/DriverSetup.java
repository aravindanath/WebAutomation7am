package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

   public WebDriver driver;


    public DriverSetup(WebDriver driver) {
        this.driver = driver;
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }
}

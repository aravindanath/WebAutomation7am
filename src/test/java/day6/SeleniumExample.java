package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumExample {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.indusind.com/in/en/personal.html?utm_source=Google_Organic_Search");

        try {
            driver.findElement(By.xpath("//a[text()='Skip to Main Content']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("(//a[text()='BUSINESS'])[1]")).click();
    }
}

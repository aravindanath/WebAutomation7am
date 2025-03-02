package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByName extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://www.google.in");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Iphone 16", Keys.ENTER);
    }
}

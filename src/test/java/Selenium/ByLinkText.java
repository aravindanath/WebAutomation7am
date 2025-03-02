package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByLinkText extends BaseTest{

    @Test
    public void testByID() {
        driver.get("https://www.amazon.in");

        driver.findElement(By.linkText("Customer Service")).click();

    }
}

package Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByPartialLinkText extends BaseTest{

    @Test
    public void testByID() {
        driver.get("https://www.amazon.in");

        driver.findElement(By.partialLinkText("Customer")).click();

    }
}

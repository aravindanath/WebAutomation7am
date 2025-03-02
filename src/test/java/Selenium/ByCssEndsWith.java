package Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByCssEndsWith extends BaseTest{

    @Test
    public void testByID(){
        driver.get("https://www.google.in");
        driver.findElement(By.cssSelector("textarea[class$='yf']")).sendKeys("Iphone 16");
    }
}

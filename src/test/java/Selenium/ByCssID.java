package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByCssID extends BaseTest{

    @Test
    public void testByID(){
        driver.get("https://www.amazon.in");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone 16", Keys.ENTER);
    }
}

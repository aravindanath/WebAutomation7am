package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByClassName extends BaseTest{

    @Test
    public void testByID(){
        driver.get("https://www.google.in");
        driver.findElement(By.className("gLFyf")).sendKeys("Iphone 16", Keys.ENTER);
    }
}

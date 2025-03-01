package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.Key;

public class ByID extends BaseTest{

    @Test
    public void testByID(){
        driver.get("https://www.amazon.in");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 16", Keys.ENTER);
    }
}

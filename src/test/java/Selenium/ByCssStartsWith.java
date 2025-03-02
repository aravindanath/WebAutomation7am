package Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByCssStartsWith extends BaseTest{

    @Test
    public void testByID(){
        driver.get("https://www.google.in");
        driver.findElement(By.cssSelector("textarea[class^='gLF']")).sendKeys("Iphone 16");
    }
}

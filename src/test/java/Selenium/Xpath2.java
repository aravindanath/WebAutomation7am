package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Xpath2 extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://www.iciciprulife.com/");

        driver.findElement(By.xpath("//a[@id='login-toggle' or @class='login-drop no-border']")).click();



    }
}

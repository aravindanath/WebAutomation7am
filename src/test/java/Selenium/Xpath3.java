package Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Xpath3 extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://www.iciciprulife.com/");

        driver.findElement(By.xpath("(//a[contains(text(),'Login')])[2]")).click();



    }
}

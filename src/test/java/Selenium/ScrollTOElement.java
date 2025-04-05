package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScrollTOElement extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://www.flipkart.com/search?q=wrist%20watch&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

        WebElement more = driver.findElement(By.xpath("//span[contains(text(),'MORE')]"));
        WebElement brand = driver.findElement(By.xpath("//div[text()='Brand']"));
        Generics.scrollToElement(driver, brand);
        Thread.sleep(3000);
        more.click();
    }
}

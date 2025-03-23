package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class MouseHover extends BaseTest{


    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://www.ajio.com/");

        WebElement element = driver.findElement(By.xpath("//span[text()='KIDS']"));

        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();

        WebElement element2 = driver.findElement(By.xpath("//a[text()='Denims & Trousers']"));

        action.click(element2).build().perform();
    }
}

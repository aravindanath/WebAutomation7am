package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class EampleWaits extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//button[text()='Start']")).click();

        WebElement element = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

        // Wait for the element to be visible

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(driver -> element.isDisplayed());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));

        // Now you can interact with the element
        System.out.println(element.getText());



    }
}

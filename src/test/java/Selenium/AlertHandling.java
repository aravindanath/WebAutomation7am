package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertHandling extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

//      Alert alert =  driver.switchTo().alert();
//
//      alert.accept();

        Generics.acceptAlert(driver);

      WebElement result = driver.findElement(By.id("result"));

      System.out.println("Result: " + result.getText());

      Thread.sleep(2000);

      driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

      Generics.dismissAlert(driver);
        System.out.println("Result: " + result.getText());

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Generics.acceptAlert(driver,"Hello all");
        System.out.println("Result: " + result.getText());
    }
}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUploadAndDownload extends BaseTest {

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");

        driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("/Users/aravindanathdm/Documents/Automation_Classes/WebAutomation7am/src/test/java/Selenium/locators");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='file-submit']")).click();

        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.linkText("resume.pdf")).click();
    }
}

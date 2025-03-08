package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameHandling extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");

        String str = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();

        System.out.println(str);
    }
}

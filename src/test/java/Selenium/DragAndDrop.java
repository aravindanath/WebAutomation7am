package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseTest {

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/drag_drop.html");

        WebElement element1 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]/a"));
        WebElement element2 = driver.findElement(By.xpath("//ol[@id='amt7']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(element1, element2).build().perform();



    }
}

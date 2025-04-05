package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDropdown extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://www.wikipedia.org/");

       WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchLanguage']"));
        Thread.sleep(2000);
        Select select = new Select(dropdown);
        select.selectByValue("nan");

        Thread.sleep(2000);
        select.selectByVisibleText("Беларуская");
        Thread.sleep(2000);
        select.selectByIndex(20);

    }
}

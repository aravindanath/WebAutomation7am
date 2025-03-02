package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Xpath1 extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://www.iciciprulife.com/");

      List<WebElement> li = driver.findElements(By.xpath("//ul[@class='nav navbar-nav navbar-right visible-lg visible-md']/li/a"));
//
     for(int i = 1; i <li.size(); i++) {
            System.out.println(li.get(i).getText());
            li.get(i).click();
            Thread.sleep(1000);
            driver.navigate().back();
            Thread.sleep(1000);
            li = driver.findElements(By.xpath("//ul[@class='nav navbar-nav navbar-right visible-lg visible-md']/li/a"));
     }


    }
}

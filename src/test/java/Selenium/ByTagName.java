package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByTagName extends BaseTest{

    @Test
    public void testByID() {
        driver.get("https://www.amazon.in");

      List<WebElement> links =  driver.findElements(By.tagName("a"));

        System.out.println("Total links on the page: " + links.size());

        for (WebElement link : links){
            System.out.println(link.getText() + " ---> " + link.getAttribute("href"));
        }

    }
}

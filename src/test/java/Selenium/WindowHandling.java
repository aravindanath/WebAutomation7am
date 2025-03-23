package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class WindowHandling extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://www.amazon.in/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16", Keys.ENTER);


        String parentID = driver.getWindowHandle();

        System.out.println("Parent ID: " + parentID);

        System.out.println("Parent Title: " + driver.getTitle());

       List<WebElement> list =  driver.findElements(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']"));

       list.get(0).click();

      Set<String> wins = driver.getWindowHandles();

      for(String win : wins){
          System.out.println(win);
          driver.switchTo().window(win);
      }

        System.out.println("Child Title: " + driver.getTitle());
      Thread.sleep(2000);



        String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]")).getText();

        System.out.println("Price: " + price);

        driver.close();

        driver.switchTo().window(parentID);
        Thread.sleep(2000);
        System.out.println("Parent Title: " + driver.getTitle());

    }
}

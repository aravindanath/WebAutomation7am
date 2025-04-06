package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class HandlingCookies extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://www.amazon.in/");

       driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
       Thread.sleep(2000);

        List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));


        for(WebElement suggestion : suggestions){
//            System.out.println(suggestion.getText());
            if(suggestion.getText().equalsIgnoreCase("iphone 16 pro 256gb")){
                suggestion.click();
                break;
            }
        }

        Generics.takeScreenshot(driver);
       Set<Cookie> ste = driver.manage().getCookies();
        System.out.println("Total Cookies: " + ste.size());

        for(Cookie cookie : ste){
            System.out.println(cookie.getName() + " : " + cookie.getValue());
        }

        Cookie cookie = new Cookie("mycookie", "myvalue");
        driver.manage().addCookie(cookie);

        System.out.println("Cookie added");

        Set<Cookie> ste1 = driver.manage().getCookies();
        System.out.println("Total Cookies: " + ste1.size());

        for(Cookie cookie1 : ste1){
            System.out.println(cookie1.getName() + " : " + cookie1.getValue());
        }
    }
}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Autosuggestion extends BaseTest{

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
    }
}

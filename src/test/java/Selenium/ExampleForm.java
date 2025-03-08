package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ExampleForm extends BaseTest{

    @Test
    public void testByID(){
        driver.get("file:///Users/aravindanathdm/Downloads/demo.html");
        driver.findElement(By.xpath("//input[@class='flag-input']")).click();
     //   driver.findElement(By.xpath("(//ul[@id='jqphone-flags-35e9868c-2eb4-89b2-9bca-b0bb123b73c1']/li[@data-dial-code='91'])[1]")).click();


    }
}

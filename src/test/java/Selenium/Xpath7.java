package Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Xpath7 extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/tables");

       String [] fn = {"Frank","John","Tim","Jason"};

       for (String str : fn) {
        String text=    driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[2][contains(text(),'"+str+"')]//preceding-sibling::td")).getText();
        System.out.println(str+" : "+text);
       }

    }
}

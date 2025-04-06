package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class HandlingSSL extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://expired.badssl.com/");


    }
}

package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Generics {


    public static void acceptAlert(WebDriver driver) {
        Alert alert =  driver.switchTo().alert();
        alert.accept();
    }

    public static void dismissAlert(WebDriver driver) {
        Alert alert =  driver.switchTo().alert();
        alert.dismiss();
    }

    public static void acceptAlert(WebDriver driver, String text) {
        Alert alert =  driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
    }

    public static void dismissAlert(WebDriver driver, String text) {
        Alert alert =  driver.switchTo().alert();
        alert.sendKeys(text);
        alert.dismiss();
    }
}

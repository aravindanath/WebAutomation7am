package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

    public  static void selectByText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void selectByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public static void selectByValue(WebElement element, String index) {
        Select select = new Select(element);
        select.selectByValue(index);
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

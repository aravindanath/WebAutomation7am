package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.io.File;


import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    public static String dateTime() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate.replace("-", "_").replace(" ", "_").replace(":", "_");
    }

    public static void takeScreenshot(WebDriver driver)  {

        try {
            TakesScreenshot srcShot = (TakesScreenshot) driver;
            File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("./target/screenshot"+dateTime()+".png");
            Files.copy(srcFile.toPath(), destFile.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}

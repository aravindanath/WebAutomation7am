package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class SeleniumExample {

    public static void main(String[] args) {

        String browser = Utitls.getValue("browser"), url = Utitls.getValue("stage_Url");
        WebDriver driver = null;
        if(browser.equalsIgnoreCase("chrome")){
              driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")) {
              driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get(url);

        try {
            driver.findElement(By.xpath("//a[text()='Skip to Main Content']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("(//a[text()='BUSINESS'])[1]")).click();
        driver.quit();
    }
}

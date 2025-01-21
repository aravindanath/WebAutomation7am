package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchBrowser {

    public static void main(String[] args) {

        String browser = "chrome";
        WebDriver driver = null;
        if(browser.equals("chrome")){
             driver = new ChromeDriver();
            System.out.println("Launch Chrome Browser");
        }else if(browser.equals("firefox")){
             driver = new FirefoxDriver();
            System.out.println("Launch Firefox Browser");
        }else if(browser.equals("safari")){
            driver = new SafariDriver();
            System.out.println("Launch Safari Browser");
        }else if(browser.equals("edge")){
            driver = new EdgeDriver();
            System.out.println("Launch Edge Browser");
        }else {
            System.out.println("Invalid Browser");
        }

        driver.get("https://www.google.com");
        driver.quit();
    }
}

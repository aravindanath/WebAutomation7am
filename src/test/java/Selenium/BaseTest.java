package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


public class BaseTest {

    protected WebDriver driver;// global variable
    @BeforeClass
    public void setup(){
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.setAcceptInsecureCerts(true);
        driver   = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

    }


    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}

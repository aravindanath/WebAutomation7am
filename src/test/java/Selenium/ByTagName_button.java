package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByTagName_button extends BaseTest{

    @Test
    public void testByID() {
        driver.get("https://moatazeldebsy.github.io/test-automation-practices/#/checkboxes");

       List<WebElement> btn =  driver.findElements(By.tagName("button"));
       System.out.println("Total buttons on the page: " + btn.size());
       for (WebElement ele : btn){
           System.out.println(ele.getText());
       }

    }
}

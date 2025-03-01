package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleWiki {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");

       List<WebElement> lang =  driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));


       System.out.println("Count Language: "+ lang.size());

       List<String> languages = new ArrayList<String>();

       for(WebElement lan : lang){
           languages.add(lan.getText());
       }

       System.out.println("Before Sort: "+ languages);

        Collections.sort(languages);

        System.out.println("After Sort: "+ languages);

       driver.quit();


    }
}

package day7;

import org.ini4j.Ini;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromINI {

    public static void main(String[] args) throws IOException {

//        String path =  System.getProperty("user.dir") + File.separator+"testData.ini";
//
//        FileInputStream fis = new FileInputStream(path);
//        Ini ini = new Ini();
//        ini.load(fis);
//       String value =  ini.get("TC001","url");
//       System.out.println(value);

        String url = Utitls.getValue("TC001","url");

        WebDriver driver = new ChromeDriver();
        driver.get(url);


    }
}

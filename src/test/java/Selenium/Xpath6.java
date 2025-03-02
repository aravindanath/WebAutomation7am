package Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Xpath6 extends BaseTest{

    @Test
    public void testByID() throws InterruptedException {
        driver.get("https://www.moneycontrol.com/commodity/");

        String [] commodities = {"SILVER","GOLD","CRUDEOIL","NATURALGAS","COPPER"};

        for(String str : commodities){

            String comName =  driver.findElement(By.xpath("//table[@class='curDerivatives_web_commontable__NT0j9']/tbody/tr/td/h4[contains(text(),'"+str+"')]//following::td[1]")).getText();


            System.out.println(str+" : "+comName);


        }


    }
}

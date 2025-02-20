package day7;

import com.github.javafaker.Faker;
import org.ini4j.Ini;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Utitls {


    public static String getValue(String key){
        String path = System.getProperty("user.dir")+ File.separator+"config.properties";
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(fis);
            value = properties.getProperty(key);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    public static void setValue(String key, String value){
        String path = System.getProperty("user.dir")+ File.separator+"config.properties";
        try {
            FileOutputStream fos = new FileOutputStream(path);
            Properties properties = new Properties();
            properties.setProperty(key, value);
            properties.store(fos, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static String firstName(){
        Faker faker = new Faker();
       return faker.name().firstName();
    }


    public static String lastName(){
        Faker faker = new Faker();
        return faker.name().lastName();
    }


    public static String fullName(){
        Faker faker = new Faker();
        return faker.name().fullName();
    }

    public static String emailId(){
        Faker faker = new Faker();
        return faker.name().firstName()+"@testmail.com";
    }


    public static String phoneNumber(){
        Faker faker = new Faker();
        return faker.phoneNumber().cellPhone();
    }

    public static String randam(){
        Faker faker = new Faker();
        return faker.number().digits(5);
    }

    public static String randamText(int length){
        Faker faker = new Faker();
        return faker.lorem().characters(length);
    }


    public static String  getValue(String header, String key)  {
        String path =  System.getProperty("user.dir") + File.separator+"testData.ini";
        String value;
        try {
            FileInputStream fis = new FileInputStream(path);
            Ini ini = new Ini();
            ini.load(fis);
            value = ini.get("TC001", "url");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return value;
    }

}

package day7;

import java.io.File;
import java.io.FileInputStream;
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
}

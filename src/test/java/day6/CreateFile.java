package day6;


import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args)  {
//        System.out.println( System.getProperty("os.name"));

        String path = System.getProperty("user.dir")+ File.separator+"config.properties";
        File file = new File(path);
        try {
            if(file.exists()) {
              System.out.println("File already exists");
            }else{
                file.createNewFile();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

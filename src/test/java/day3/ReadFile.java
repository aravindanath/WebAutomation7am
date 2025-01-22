package day3;

import java.io.*;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        String filepath =  System.getProperty("user.dir")+ File.separator+"TestData";

        BufferedReader br = new BufferedReader(new FileReader(filepath));

        System.out.println(br.readLine());

        String x ="";

        while((x = br.readLine())!=null){
            System.out.println(x);
        }

    }
}

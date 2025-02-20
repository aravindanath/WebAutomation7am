package day7;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGen {

    public static void main(String[] args) {
//
//        Faker faker = new Faker(new Locale("en-IND"));
//      String name =   faker.name().firstName();
//      String lastName = faker.name().firstName();
//      String fullName = faker.name().fullName();
//
//      System.out.println(name);
//      System.out.println(lastName);
//      System.out.println(fullName);


        System.out.println(Utitls.randamText(100));

    }
}

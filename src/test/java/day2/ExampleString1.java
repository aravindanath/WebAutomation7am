package day2;

public class ExampleString1 {

    public static void main(String[] args) {
        //0,1,2,3,4
        String name = "John";

        System.out.println("Name: " + name);
        System.out.println("Count of characters in name: " + name.length());

        System.out.println("Name in uppercase: " + name.toUpperCase());
        System.out.println("Name in lowercase: " + name.toLowerCase());
        String statment = "I am from Bangalore";
        System.out.println(statment.replace("a","@").replace("m","M"));
        System.out.println(name.charAt(1));




    }
}

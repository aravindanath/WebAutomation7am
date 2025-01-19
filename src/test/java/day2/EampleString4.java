package day2;

public class EampleString4 {
    public static void main(String[] args) {

        String firstName =  "John_234";

       String name =firstName.split("_")[0];
        System.out.println(name);

        String num = firstName.split("_")[1];
        System.out.println(num);



    }
}

package day2;

public class EampleString2 {
    public static void main(String[] args) {

        String firstName = "John";
        String secondName = "Stev";

        System.out.println(firstName+secondName);
        System.out.println(firstName.concat(secondName));

        System.out.println(firstName.contains("oh"));
        System.out.println(firstName.equals("JohN"));
        System.out.println(firstName.equalsIgnoreCase("JohN"));
        System.out.println(firstName=="JohN");
        System.out.println(11==20);

        System.out.println(firstName.endsWith("N"));
        System.out.println(firstName.startsWith("J"));

        System.out.println(firstName.indexOf("h"));
        System.out.println(firstName.isEmpty());

    }
}

package day2;

public class Registration {
    // Non static global variable
    static String city = "Bangalore";
    static String state = "Karnataka";

    public static void main(String[] args) {
//        System.out.println("city: " + city);
        Registration reg = new Registration();
//        System.out.println("state: " + reg.state);
//        System.out.println("City: " + reg.city);

        System.out.println("city: " + city);
        System.out.println("State: " + state);
//        reg.registerUser("John", "jjohdn@gmaol.com");

        registerUser("John", "jsdf@gmailc.com");


    }


    public static void registerUser(String name, String email){
        System.out.println("User registered with name: " + name + " and email: " + email + "city: "+ city );
        city = "Delhi";
        System.out.println("User registered with name: " + name + " and email: " + email + "city: "+ city );
    }

}

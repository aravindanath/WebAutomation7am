package day6;

public class ExceptionExample6 {


    public static void main(String[] args) {


        System.out.println("Starting...");

        String  i = null;
        int x = 0;
        try {
            i = "133A";
            // type casting String to int
            int num = Integer.parseInt(i);
            x = 10;
            System.out.println(x+num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }



        System.out.println("Ending...");


    }
}

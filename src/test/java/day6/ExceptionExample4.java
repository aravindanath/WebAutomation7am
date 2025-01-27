package day6;

public class ExceptionExample4 {


    public static void main(String[] args) {


        System.out.println("Starting...");

        String  i = null;
        int x = 0;
        try {
            i = "13q3";
            // type casting String to int
            int num = Integer.parseInt(i);
            x = 10;
            System.out.println(x+num);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Finally block executed");
        }



        System.out.println("Ending...");


    }
}

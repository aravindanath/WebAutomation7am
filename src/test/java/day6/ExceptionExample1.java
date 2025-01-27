package day6;

public class ExceptionExample1 {


    public static void main(String[] args) {


        System.out.println("Starting...");

        try {
            int i = 10;
            int x = 0;

            int div = i /x;

            System.out.println("Division: " + div);
        } catch (ArithmeticException e) {
          e.printStackTrace();
        }

        System.out.println("Ending...");


    }
}

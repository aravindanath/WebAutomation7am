package day6;

public class ExceptionExample2 {


    public static void main(String[] args) {


        System.out.println("Starting...");

        try {
            String city =null;

            System.out.println(city.length());
        } catch (ArithmeticException e) {
          e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }catch (NullPointerException e) {
            e.printStackTrace();
        }

        System.out.println("Ending...");


    }
}

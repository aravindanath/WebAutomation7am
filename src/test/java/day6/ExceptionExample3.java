package day6;

public class ExceptionExample3 {


    public static void main(String[] args) {


        System.out.println("Starting...");

        try {
            String city =null;

            System.out.println(city.length());
        } catch (ArithmeticException e) {
          e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Ending...");


    }
}

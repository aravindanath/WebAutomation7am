package day6;

public class ExampleThrow {

    public static void main(String[] args) throws Exception {

        int amt = 99;

        if(amt < 100) {

                throw new Exception("Insufficient amount");

        }else{

            System.out.println("pls collect the  Amount");

        }

        System.out.println("Ending...");
    }
}

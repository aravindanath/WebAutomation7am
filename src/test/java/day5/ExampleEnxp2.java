package day5;

public class ExampleEnxp2 {

    public static void main(String[] args) {

        ExampleEncp exampleEncp = new ExampleEncp();
        exampleEncp.setCc(34112341234134L);
        exampleEncp.setName("Arvind");
        exampleEncp.setCvv(1234);
        exampleEncp.setExpDate("2008-01-11");


        System.out.println(exampleEncp.getExpDate());
        System.out.println(exampleEncp.getCc());
        System.out.println(exampleEncp.getCvv());
        System.out.println(exampleEncp.getName());

        System.out.println("****************************************************************");
        exampleEncp.setCc(3411234123324134134L);
        exampleEncp.setName("Atharv");
        exampleEncp.setCvv(3211);
        exampleEncp.setExpDate("2010-01-11");


        System.out.println(exampleEncp.getExpDate());
        System.out.println(exampleEncp.getCc());
        System.out.println(exampleEncp.getCvv());
        System.out.println(exampleEncp.getName());

    }


}

package day5;

public class ExampleStringBuider {

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("Arvind");
//        System.out.println(  sb.reverse());
        sb.append("Sharma");
        System.out.println(sb.toString());
        sb.insert(0, "Anand");
        System.out.println(sb.toString());
    }
}

package day3;

import java.util.ArrayList;

public class ExampleLambda {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Kevin");
        names.forEach((ref) -> System.out.println(ref));
    }
}

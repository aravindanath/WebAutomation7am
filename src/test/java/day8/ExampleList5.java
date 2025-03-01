package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExampleList5 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();

        list.add("Arvind");
        list.add("GOpal");
        list.add("Tarun");
        list.add("Shalini");
        list.add("Shalini");

        list.add(0,"Rajkumar");
        list.remove(4);

        System.out.println(list);




    }
}

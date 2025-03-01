package day8;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();

        list.add("Arvind");
        list.add("GOpal");
        list.add("Tarun");
        list.add("Shalini");


        System.out.println(list.get(2));

        System.out.println(list);

        for(String str : list){
            System.out.println(str);
        }

    }
}

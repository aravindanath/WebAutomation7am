package day8;

import java.util.ArrayList;
import java.util.List;

public class ExampleList2 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();

        list.add("Arvind");
        list.add("GOpal");
        list.add("Tarun");
        list.add("Shalini");


        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}

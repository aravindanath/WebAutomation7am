package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ExampleList4 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();

        list.add("Arvind");
        list.add("GOpal");
        list.add("Tarun");
        list.add("Shalini");
        list.add("Shalini");

       Iterator li =  list.iterator();

       while (li.hasNext()) {
           System.out.println(li.next());
       }



    }
}

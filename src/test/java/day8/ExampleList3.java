package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExampleList3 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();

        list.add("Arvind");
        list.add("GOpal");
        list.add("Tarun");
        list.add("Shalini");
        list.add("Shalini");

       ListIterator li =  list.listIterator();

       while (li.hasNext()){
           System.out.println(li.next());
       }

       System.out.println("****************************************************************");


       while (li.hasPrevious()){
           System.out.println(li.previous());
       }



    }
}

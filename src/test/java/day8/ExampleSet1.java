package day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleSet1 {

    public static void main(String[] args) {

        // Window handling

         Set<String> set = new HashSet<String>();

         set.add("Aadvik");
         set.add("Vasavi");
         set.add("Naveen");
         set.add("Praveen");
         set.add("Aadvik");

         for (String s : set) {
             System.out.println(s);
         }


    }
}

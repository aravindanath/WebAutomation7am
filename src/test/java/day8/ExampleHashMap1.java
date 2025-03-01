package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap1 {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        a.add("Alphabet");
        a.add("Amazon");

        ArrayList<String> b = new ArrayList<String>();
        b.add("Bloom");
        b.add("Blue");


        HashMap<String, Object> c = new HashMap<String, Object>();
        c.put("A",a);
        c.put("B",b);
        c.put("C","Cheeta");

        for(Map.Entry<String, Object> val : c.entrySet()){
            System.out.println(val);
        }

    }
}



/*

  A -- Apple, Alphabet
  B -- Bluetooth, Bloomberg
 */
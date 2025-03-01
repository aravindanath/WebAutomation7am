package day8;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

    public static void main(String[] args) {


        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Name", "Arvind");
        map.put("City", "Banglaore");



//        System.out.println(map.get("City"));

        for(Map.Entry<String, String> var : map.entrySet()){
            System.out.println(var.getValue());
        }
    }
}

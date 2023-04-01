package Hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Hashmap_Demo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Raj",55);
        map.put("Pankaj",72);
        map.put("Amisha",35);
        map.put("Deepak",23);
        map.put("kavya",59);
        map.put("Raj",35);
        System.out.println(map);
//        System.out.println(map.containsKey("Amisha"));
//        System.out.println(map.containsKey("raj"));
//        System.out.println(map.get("Amisha"));
//        System.out.println(map.get("raj"));

        Set<String> s = map.keySet();
        for (String i:s){
            System.out.println(i+" "+map.get(i));
        }
        TreeMap<String,Integer> map1 = new TreeMap<>();
        map1.put("Raj",55);
        map1.put("Pankaj",72);
        map1.put("Amisha",35);
        map1.put("Deepak",23);
        map1.put("kavya",59);
        map1.put("Raj",35);
//        System.out.println(map1);

        LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>();
        map2.put("Raj",55);
        map2.put("Pankaj",72);
        map2.put("Amisha",35);
        map2.put("Deepak",23);
        map2.put("kavya",59);
        map2.put("Raj",35);
//        System.out.println(map2);
    }
}

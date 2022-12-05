package leetcode;

import java.util.*;


public class SortCharactersByFrequency_451 {
    public static void main(String[] args) {
        String str = "Aabb";
        System.out.println(frequencySort(str));
    }
    public static String frequencySort(String s){

        HashMap<Character,Integer> map =new HashMap<>();
        for (char c :s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> [] ll = new List[s.length()+1];
        for (Character key: map.keySet()){
            int freq = map.get(key);
            if (ll[freq]==null){
                ll[freq]=new ArrayList<>();
            }
            ll[freq].add(key);
        }
        StringBuilder sb = new StringBuilder();
        for (int i= ll.length-1; i>=0 ; i--) {
            if (ll[i]!=null){
                for (char c :ll[i]){
                    for (int j = 0; j < map.get(c); j++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}

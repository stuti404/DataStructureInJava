package leetcode;

import java.util.HashMap;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        String  s = "anagam", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length()!= t.length()) return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map1.containsKey(ch)==false){
                return false;
            } else if (map1.get(ch)==1) {
                map1.remove(ch);
            }
            else {
                map1.put(ch,map1.get(ch)-1);
            }
        }
        return map1.size()==0;
    }
}

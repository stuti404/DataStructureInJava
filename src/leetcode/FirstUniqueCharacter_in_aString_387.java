package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter_in_aString_387 {
    public static void main(String[] args) {
        String s1 ="loveleetcode";
        System.out.println(firstUniqChar(s1));
    }
    public static int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}

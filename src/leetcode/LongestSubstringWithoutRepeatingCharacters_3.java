package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
//        lengthOfLongestSubstring(s);
    }
    public static int lengthOfLongestSubstring(String s) {
        int i =0;
        int j =0;
        int len =0;
        HashMap<Character,Integer>map = new HashMap<>();
        while (j<s.length() && i<=j){
            //grow
            if (map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j))+1,i);
            }
            //shrink
            map.put(s.charAt(j),j);
            //cal
            len =Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}

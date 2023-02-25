package leetcode;

import java.util.HashMap;

public class LongestPalindrome_409 {
    public static void main(String[] args) {

    }
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c= s.charAt(i);
            if (hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else {
                hm.put(c,1);
            }
        }
        int ans =0;
        boolean  isFirst = false;
        for (Character key:hm.keySet()) {
            if (hm.get(key)%2==0){
                ans+=hm.get(key);
            }else {
                if (isFirst==false){
                    ans+=hm.get(key);
                    isFirst = true;
                }
                else
                    ans +=hm.get(key)-1;
            }
        }
        return ans;
    }
}

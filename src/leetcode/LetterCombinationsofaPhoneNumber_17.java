package leetcode;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber_17 {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void main(String[] args) {
        String str ="23";
        List<String> list = new ArrayList<>();
    }
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length()==0){
            return list;
        }
         keyPad(digits,"",list);
         return list;
    }
    public static void keyPad(String pad,String ans,List<String>list){
        if (pad.length()==0){
            list.add(ans);
            return;
        }
        char ch = pad.charAt(0);
        String press = key[ch-'0'];
        for (int i = 0; i < press.length(); i++) {
            keyPad(pad.substring(1),ans+press.charAt(i),list);
        }
    }
}

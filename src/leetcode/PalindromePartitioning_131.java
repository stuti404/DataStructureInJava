package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning_131 {
    public static void main(String[] args) {
        String st = "NITIN";
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        isPartition(st,ll,ans);
    }
    public static void isPartition(String s,List<String>ll,List<List<String>>ans){
        if (s.length()==0){
            ans.add(ll);
            return;
        }
        for (int j = 1; j <= s.length(); j++) {
            String st = s.substring(0,j);
            if (isPalandrom(st)){
                ll.add(st);
                isPartition(s.substring(j),ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
    public static boolean isPalandrom(String str){
        int i =0;
        int j = str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

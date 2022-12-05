package leetcode;

import java.util.*;

public class DetermineifTwoStringsAreClose_1657 {
    public static void main(String[] args) {
        String  word1 = "abc";
        String  word2 = "bca";
        System.out.println(TwoStringsAreClose(word1,word2));
    }

    public static boolean TwoStringsAreClose(String word1,String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int [] arr = new int[26];
        int [] brr = new int[26];
        for (char c : word1.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            brr[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if ((arr[i]==0 && brr[i]!=0)|| (arr[i]!=0 && brr[i]==0)){
                return false;
            }
        }
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i :arr){
            if(i>0){
                map.put(i, map.getOrDefault(i,0)+1);
            }
        }
        for(int i :brr){
           if (i>0){
               if(!map.containsKey(i)){
                   return  false;
               }
               map.put(i, map.get(i)-1);
               if (map.get(i)==0){
                   map.remove(i);
               }
           }
        }
        return map.size()==0;

    }
}

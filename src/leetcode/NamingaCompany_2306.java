package leetcode;

import java.util.HashSet;
import java.util.Set;

public class NamingaCompany_2306 {
    public static void main(String[] args) {

    }
    public long distinctNames(String[] ideas) {
        Set<String>[] suffix = new Set[26];
        for (int i = 0; i < 26; i++) {
            suffix[i] = new HashSet<>();
        }
        for (String idea :ideas) {
            suffix[idea.charAt(0)-'a'].add(idea.substring(1));
        }
        long pairs = 0;
        for (int i =0; i<26;i++){
            for (int j = i+1; j <26 ; j++) {
                int overlapping =0 ;
                for (String suf: suffix[i]){
                    if (suffix[j].contains(suf)){
                        overlapping++;
                    }
                }
                pairs += (suffix[i].size()-overlapping)*(suffix[j].size()-overlapping)*2;
            }
        }
        return pairs;
    }
}

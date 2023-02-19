package leetcode;

public class PermutationinString_567 {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1>len2) return false;

        int []ch = new int[26];
        for (int i = 0; i < len1; i++) {
            ch[s1.charAt(i)-'a']++;
        }
        for (int i = 0; i < len2; i++) {
            ch[s2.charAt(i)-'a']--;
            if (i-len1>=0){
                ch[s2.charAt(i-len1)-'a']++;
            }
            if (allZero(ch)) return true;
        }
        return false;
    }
    public static boolean allZero(int[]count){
        for (int i = 0; i < 26; i++) {
            if (count[i] !=0) return false;
        }
        return true;
    }
}

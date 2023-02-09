package leetcode;

public class IsSubsequence_392 {
    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
     public static boolean isSubsequence(String s, String t) {
        if (s.length()==0)  return true;
        int j =0;
         for (int i = 0; i <t.length() ; i++) {
             if (t.charAt(i) == s.charAt(j)) {
                 j++;
             }
             if (j>=s.length())return true;
         }
       return false;
    }
}

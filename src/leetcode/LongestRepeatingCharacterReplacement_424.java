package leetcode;

public class LongestRepeatingCharacterReplacement_424 {
    public int characterReplacement(String s, int k) {
        int a = character(s,k,'b');
        int b = character(s,k,'a');
        return Math.max(a,b);
    }
    public static int character(String str,int k,char ch){
        int si =0;
        int ei =0;
        int ans =0;
        int flip =0;
        while (ei<str.length()){
            if (str.charAt(ei)==ch){
                flip++;
            }
            while (flip>k && si<=ei){
                if (str.charAt(si)==ch){
                    flip--;
                }
                si++;
            }
            ans =Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}

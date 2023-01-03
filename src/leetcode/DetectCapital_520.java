package leetcode;

public class DetectCapital_520 {
    public static void main(String[] args) {
        String s="ggg";
        String a ="l";
        String b = "TTre";
        System.out.println(detectCapitalUse(s));
        System.out.println(detectCapitalUse(a));
        System.out.println(detectCapitalUse(b));
    }
    public static boolean detectCapitalUse(String word) {
        int cap =0;
        if (word.length()==0||word.length()==1) return true;
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) >= 'A') && (word.charAt(i) <= 'Z')){
                cap++;
            }
        }
        if (cap==word.length())return true;
        if (cap==0)return true;
        if ((cap == 1) && (word.charAt(0) >= 'A') && (word.charAt(0) <= 'Z')) return true;
        return false;
    }
}

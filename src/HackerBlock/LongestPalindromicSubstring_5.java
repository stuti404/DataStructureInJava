package HackerBlock;

public class LongestPalindromicSubstring_5 {
    public static void main(String[] args) {
//        String s = "a";
        String t = "cbb";
        System.out.println(longestPalindrome(t));
//        longestPalindrome(s);
//        longestPalindrome(t);
    }

    public static String longestPalindrome(String s) {
        int n = s.length(), start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            int len_odd = expandAroundCenter(s, i, i);
            int len_even = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len_odd, len_even);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right, n = s.length();

        while(L >= 0 && R < n && s.charAt(L) == s.charAt(R) ) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}

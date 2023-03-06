package leetcode;

public class Find_theIndex_of_the_FirstOccurrence_in_a_String_28 {
    public static void main(String[] args) {

    }
    // this code will work
//    public int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
//    }
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();
        for (int i = 0; i < n1; i++) {
            if (haystack.charAt(i)==needle.charAt(0)){
                if (comapare(haystack,needle,i)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static boolean comapare(String haystack,String needle, int i){
        int n1 = haystack.length();
        int n2 = needle.length();
        for (int j = 0; j < n2; j++) {
            if (i>=n1) return false;
            if(haystack.charAt(i) == needle.charAt(j) && j < needle.length()){
                return false;
            }
        }
        return true;
    }
}

package leetcode;

public class RansomNote_383 {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int []arr = new int[26];
        for (char ch:magazine.toCharArray()){
            arr[ch-'a']++;
        }
        for (char ch:ransomNote.toCharArray()){
            if (arr[ch-'a']==0){
                return false;
            }
            arr[ch-'a']--;
        }
        return true;
    }
}

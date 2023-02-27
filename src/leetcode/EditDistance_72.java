package leetcode;

public class EditDistance_72 {
    public static void main(String[] args) {
        String word1 = "horse", word2 = "ros";
    }
    public static int minDistance(String word1, String word2) {
        int memo [][]= new int[word1.length()+1][word2.length()+1];
        int ans = min(word1,word2,memo);
        return ans;
    }
    public static int min(String word1, String word2,int [][]arr) {
        if (word1.length()==0){
            return word2.length();
        }
        if (word2.length()==0){
            return word1.length();
        }
        if (arr[word1.length()][word2.length()]>0){
            return arr[word1.length()][word2.length()];
        }
        if (word1.charAt(0)==word2.charAt(0)){
            arr[word1.length()][word2.length()]= min(word1.substring(1),word2.substring(1),arr);
            return min(word1.substring(1),word2.substring(1),arr);
        }
        else {
            int op1 = min(word1.substring(1),word2.substring(1),arr);
            int op2 = min(word1,word2.substring(1),arr);
            int op3 = min(word1.substring(1),word2,arr);
            arr[word1.length()][word2.length()]=1+Math.min(op1,Math.min(op2,op3));
            return 1+Math.min(op1,Math.min(op2,op3));
        }
    }
}

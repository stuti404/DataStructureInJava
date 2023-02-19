package leetcode;

public class ReverseWordsinaStringIII_557 {
    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords(String s) {
        int start = 0;
        char[] arr = s.toCharArray();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]==' '){
                reverse(start,j-1,arr);
                start = j+1;
            }
            else if (j==arr.length-1){
                reverse(start,j,arr);
            }
        }
        return new String(arr);
    }
    private static void reverse(int start,int end,char[] arr){
        while (start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

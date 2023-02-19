package leetcode;

public class ReverseString_344 {
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        reverseString(arr);
    }
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while(i<=j){
            char temp = s[i];
            s[i] =s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}

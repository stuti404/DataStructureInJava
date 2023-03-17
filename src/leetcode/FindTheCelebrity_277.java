package leetcode;

import java.util.Stack;

public class FindTheCelebrity_277 {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
        System.out.println(celebrity(arr));
    }
    public static int  celebrity(int [][] arr){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        // candidate
        while (st.size()>1){
            int a = st.pop();
            int b = st.pop();
            if (arr[a][b] ==1){
                st.push(b);
            }else {
                st.push(a);
            }
        }
        int celebrity = st.pop();
        for (int i = 0; i < arr.length; i++) {
            if (i!= celebrity && (arr[i][celebrity]==0||arr[celebrity][i]==1)){
                return -1;
            }
        }
        return celebrity;
    }
}

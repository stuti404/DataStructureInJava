package HackerBlock;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr =new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        stock(arr);
    }
    public static void  stock(int []arr){
        int [] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            // Span calculate
            if (st.isEmpty()){
                ans[i]= i+1;
            }
            else {
                ans[i] = i-st.peek();
            }
            st.push(i);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.print("END");
    }
}

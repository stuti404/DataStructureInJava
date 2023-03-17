package leetcode;

import java.util.*;

public class LargestRectangleinHistogram_84 {
    public static void main(String[] args) {
        int [] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
    public  static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max_area =0;
        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty()&& heights[i]<heights[st.peek()]){
                int r =i;
                int h = heights[st.pop()];
                if (st.isEmpty()){
                    max_area = Math.max(max_area,r*h);
                }
                else {
                    int l = st.peek();
                    max_area= Math.max(max_area,(r-l-1)*h);
                }
            }
            st.push(i);
        }
        int r = heights.length;
        while (!st.isEmpty()){
            int h = heights[st.pop()];
            if (st.isEmpty()){
                max_area = Math.max(max_area,r*h);
            }
            else {
                int l = st.peek();
                max_area= Math.max(max_area,(r-l-1)*h);
            }
        }
        return max_area;
    }
}

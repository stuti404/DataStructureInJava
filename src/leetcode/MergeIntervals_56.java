package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals_56 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] interval:intervals){
            if (list.size()==0){
                list.add(interval);
            }
            else {
                int prev[] =list.get(list.size()-1);
                if (interval[0]<prev[1]){
                    prev[1]=Math.max(prev[1],interval[1]);
                }
                else {
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}

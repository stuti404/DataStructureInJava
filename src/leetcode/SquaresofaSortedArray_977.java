package leetcode;

import java.util.Arrays;

public class SquaresofaSortedArray_977 {
    public static void main(String[] args) {
        int arr[] ={-4,-1,0,3,10};
        sortedSquares(arr);

    }
    public static int[] sortedSquares(int[] nums) {
        int [] arr =new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
       return arr;
    }
}

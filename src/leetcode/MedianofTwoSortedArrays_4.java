package leetcode;

import java.util.Arrays;

public class MedianofTwoSortedArrays_4 {
    public static void main(String[] args) {
        int [] nums1 = {1,3};
        int [] nums2 = {2,3};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int a = nums1.length;
        int b = nums2.length;
        int c = a + b;

        int[] arr = new int[c];
        for (int i = 0; i < a; i ++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < b; i ++) {
            arr[a + i] = nums2[i];
        }
        Arrays.sort(arr);


        if(arr.length%2==0){
            int mid = arr.length/2;
            double ans = (float)(arr[mid]+arr[mid-1])/2;
            return ans;

        }
        else {
            int mid = (arr.length-1)/2;
            return arr[mid] ;
        }
    }
}

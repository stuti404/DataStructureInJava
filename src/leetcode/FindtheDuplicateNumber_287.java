package leetcode;

import java.util.Arrays;

public class FindtheDuplicateNumber_287 {
    public static void main(String[] args) {
        int []nums1 = { 1,3,4,2,2};//2
        int []nums2 = {3,1,3,4,2};//3
        System.out.println(findDuplicate(nums1));
        System.out.println(findDuplicate(nums2));
    }
    public static int findDuplicate(int[] nums) {
        int ans =0;
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i]);
            if (nums[index]<0){
                return index;
            }
            nums[index]=-nums[index];
        }
        return ans;
    }
}

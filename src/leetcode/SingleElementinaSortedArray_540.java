package leetcode;

import java.util.Arrays;

public class SingleElementinaSortedArray_540 {
    public static void main(String[] args) {
        int []nums = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) {
        int i =0;
        int j =nums.length-1;
        int ans =0;
        while (i<j){
            int mid = i+(j-i)/2;
            if ((mid%2==0 &&mid+1 <nums.length && nums[mid]==nums[mid+1]) ||
                    (mid %2==1 && mid-1>=0 && nums[mid]==nums[mid-1])){
                i=mid+1;
            }
            else
                j = mid;
            if (mid-1 >=0 && mid+1< nums.length &&nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];
        }
        return nums[i];
    }
}

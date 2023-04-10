package leetcode;

import java.util.Arrays;

public class LongestIncreasingSubsequence_300 {
    public static void main(String[] args) {
        int []nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
//    //Approach 1  N^2
//    public static int lengthOfLIS(int[] nums) {
//        int [] dp = new int[nums.length];
//        Arrays.fill(dp,1);
//        for (int i = 1; i < dp.length; i++) {
//            for (int j =i-1 ; j >=0 ; j--) {
//                if (nums[i]>nums[j]){
//                    dp[i] = Math.max(dp[i],dp[j]+1);
//                }
//            }
//        }
//        int ans =0;
//        for (int i = 0; i < dp.length; i++) {
//            if (dp[i]>ans){
//                ans=dp[i];
//            }
//        }
//        return ans;
//    }
    //Approach 1  O(NlogN)
    public static int lengthOfLIS(int[] nums) {
        int []lis = new int[nums.length];
        lis[0]=nums[0];
        int len =1;
        for (int i = 1; i < lis.length; i++) {
            if (nums[i]>lis[len-1]){
                lis[len]=nums[i];
                len++;
            }else {
                int idx = search(lis,0,len-1,nums[i]);
                lis[idx]=nums[i];
            }
        }
        return len;
    }

    private static int search(int[] lis, int si, int ei, int num) {
        int ans =0;
        while (si<=ei){
            int mid =(si+ei)/2;
            if (lis[mid]>=num){
                ans=mid;
                ei=mid-1;
            }else {
                si=mid+1;
            }
        }
        return ans;
    }

}

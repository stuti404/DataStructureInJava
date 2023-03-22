package leetcode;

public class NumberofZeroFilledSubarrays_2348 {
    public static void main(String[] args) {
        int []nums = {1,3,0,0,2,0,0,4,0};
//        zeroFilledSubarray(nums);
        System.out.println(zeroFilledSubarray(nums));
    }
    public static long zeroFilledSubarray(int[] nums) {
        long count =0;
        long ans =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                count++;
            }
            else {
                ans +=(count*(count+1)/2);
                count=0;
            }
        }

        return ans +=(count*(count+1)/2);
    }
}

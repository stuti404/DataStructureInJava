package leetcode;

public class TwoSum_1 {
    public static void main(String[] args) {
        int []nums = {2,7,11,15};
        int target = 9;
    }
    public int[] twoSum(int[] nums, int target) {
        int []arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    arr[0] =nums[0];
                    arr[1] = nums[1];
                }
            }
        }
        return arr;
    }
}

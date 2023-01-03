package leetcode;

public class FindPivotIndex_724 {
    public static void main(String[] args) {
        int []nums = {1,2,3};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
       int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i]+sum;
        }
        int leftSum =0;
        int rightSum =sum;
        for (int i = 0; i < nums.length; i++) {
            rightSum = rightSum-nums[i];
            if (rightSum==leftSum){
              return i;
            }
            leftSum +=nums[i];
        }
       return -1;
    }
}

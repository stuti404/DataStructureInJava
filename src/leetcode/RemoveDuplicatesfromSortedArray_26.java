package leetcode;

public class RemoveDuplicatesfromSortedArray_26 {
    public static void main(String[] args) {
        int []nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int j =0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j]!=nums[i]){
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}

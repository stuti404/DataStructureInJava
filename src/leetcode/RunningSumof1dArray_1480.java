package leetcode;

public class RunningSumof1dArray_1480 {
    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        runningSum(nums);
    }
    public static int[] runningSum(int[] nums) {
        int [] arr = new int[nums.length];
        int pre =nums[0];
        arr[0]=nums[0];
        for (int i =1; i< arr.length;i++){
            arr[i] = pre+nums[i];
            pre = arr[i];
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
}

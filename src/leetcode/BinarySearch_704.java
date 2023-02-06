package leetcode;

public class BinarySearch_704 {
    public static void main(String[] args) {
        int []nums = {-1,0,3,5,9,12};
        int target = 5;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int i =0;
        int j = nums.length-1;
        while (i<=j){
            int mid = (i+j)/2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid]<target){
                i = mid+1;
            }
            else if (nums[mid]>target){
                j = mid-1;
            }
        }
        return -1;
    }
}

package leetcode;

public class SearchinRotatedSortedArray_33 {
    public static void main(String[] args) {
        int []nums = {3,1};
        int target = 1;
        System.out.println(binarysearch(nums,target));
    }

    public static int binarysearch(int []nums,int target) {
        int lo =0;
        int hi = nums.length-1;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[lo]<=nums[mid]){
                if (nums[lo]<=target && target<=nums[mid]){
                    hi = mid-1;
                }
                else {
                    lo = mid+1;
                }
            }
            else {
                if(nums[mid]<=target && target<=nums[hi]){
                    lo = mid+1;
                }
                else {
                    hi = mid-1;
                }
            }
        }
        return -1;
    }
}

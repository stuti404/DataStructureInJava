package leetcode;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
       int[] nums1 = {0};
       int [] nums2 = {1};
       int m = 0;
       int n = 1;
       merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m+n-1;
        int p1 = m-1;
        int p2 = n-1;
        while (p2>=0){
            if (p1>=0 && nums1[p1]>nums2[p2]) {
                nums1[i--] = nums1[p1--];
            }
            else {
                nums1[i--] = nums2[p2--];
            }
        }
    }
}

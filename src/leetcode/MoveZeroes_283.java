package leetcode;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        int [] arr = {1,1,0,3,12};
        moveZeroes(arr);
    }
    public static void moveZeroes(int[] nums) {
        int i =0;
        int j =0;
        while(i<nums.length){
            if (nums[i] ==0){
                i++;
            }
            else {
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]=temp;
                j++;
                i++;
            }
        }
    }
}

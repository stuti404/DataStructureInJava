package leetcode;

public class ShuffletheArray_1470 {
    public static void main(String[] args) {
        int [] num = {2,5,1,3,4,7};
        int n = 3;
        shuffle(num,n);
//        for (int i = 0; i < num.length ; i++) {
//            System.out.print(num[i]+" ");
//        }
    }
    public static int[] shuffle(int[] nums, int n) {
        int [] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                arr[i]= nums[i/2];
            }
            else {
                arr[i]= nums[n+i/2];
            }
        }
        return arr;
    }
}

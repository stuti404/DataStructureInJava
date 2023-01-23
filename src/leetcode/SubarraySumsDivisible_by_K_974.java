package leetcode;

public class SubarraySumsDivisible_by_K_974 {
    public static void main(String[] args) {
        int [] arr = {4,5,0,-2,-3,1};
        int k =5;
        subarray(arr,k);
    }
    public  static void subarray(int []arr, int k ){
        int [] brr = new int[arr.length];
        int count =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i ;j < arr.length; j++) {
                for (int l = i; l <=j ; l++) {
                    int sum =0;
                    brr[l]=sum+arr[l];
                    System.out.print(brr[l]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}


package leetcode;

public class TrappingRainWater_42 {
    public static void main(String[] args) {
        int []arr ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println( trap(arr));

    }
    public static int trap(int [] arr){
        int a =0;
        int []left = new int[arr.length];
        left[0]=arr[0];
        for (int i = 1; i < left.length; i++) {
            left[i]=Math.max(left[i-1],arr[i]);
        }
        int [] right = new int[arr.length];
        right[right.length-1]=arr[arr.length-1];
        for (int i = right.length-2; i >=0 ; i--) {
            right[i]=Math.max(right[i+1],arr[i]);
        }
        for (int i = 0; i < left.length; i++) {
            left[i]=Math.min(left[i],right[i]);
           left[i]=left[i]-arr[i];
            a = a+left[i];

        }
       return a;
    }
}

package leetcode;

public class MinimumAverageDifference_2256 {
    public static void main(String[] args) {
        int []arr = {2,5,3,9,5,3};
        System.out.println(Mini(arr));
    }
    public  static int Mini(int []arr){
        int sum =0;
        long cur =0;
        int ans =-1;
        int min = Integer.MAX_VALUE;

        for (int j : arr) {
            sum = j + sum;
        }
        for (int i = 0; i < arr.length; i++) {
            cur= arr[i]+cur;
            long avg1 = cur/(i+1);
            long avg2 = sum -cur;
            if(i != arr.length-1){
                avg2 = avg2/(arr.length-i-1);
            }
            int dif =(int) Math.abs(avg1-avg2);
            if (dif<min){
                ans = i;
                min = dif;
            }
        }
        return ans;
    }
}

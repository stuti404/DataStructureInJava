package leetcode;

import java.util.HashMap;

public class SubarraySumsDivisible_by_K_974 {
    public static void main(String[] args) {
        int [] arr = {4,5,0,-2,-3,1};
        int k =5;
        System.out.println(subarray(arr,k));
    }
    public  static int subarray(int []arr, int k ){
        int ans =0;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int rem =0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
            rem = sum%k;
            if (rem <0){
                rem = rem+k;
            }
            if (map.containsKey(rem)){
                ans = ans+map.get(rem);
                map.put(rem, map.get(rem)+1);
            }
            else {
                map.put(rem,1);
            }
        }
        return ans;
    }
}


package leetcode;

import java.util.*;

public class Sum3_15 {
    public static void main(String[] args) {
        int []arr ={-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> map = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2 ; i++) {
            int k = i+1;
            int j = nums.length-1;
            while(k<j){
                if (nums[k]+nums[j]==-nums[i]){
                    map.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j--;
                    k++;
                }
                else if (nums[k]+nums[j] >-nums[i]) j--;
                else if (nums[k]+nums[j] < -nums[i])k++;
            }
        }
        return new ArrayList<>(map);
    }
}

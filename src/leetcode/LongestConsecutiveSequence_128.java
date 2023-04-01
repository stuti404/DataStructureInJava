package leetcode;

import java.util.HashMap;

public class LongestConsecutiveSequence_128 {
    public static void main(String[] args) {
        int []nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.print(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]-1)){
                map.put(nums[i]-1,false);
            }
            else {
                map.put(nums[i],true);
            }
            if (map.containsKey(nums[i]+1)){
                map.put(nums[i]+1,false);
            }
        }
        int ans =0;
        for (int i:map.keySet()) {
            if (map.get(i)){
                int c =0;
                while (map.containsKey(i)){
                    i++;
                    c++;
                }
                ans = Math.max(ans,c);
            }
        }
        return ans;
    }

}

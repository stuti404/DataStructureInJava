package leetcode;

import java.util.*;

public class LongestSubsequenceWithLimitedSum_2389 {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int [] prefixsum = new int[nums.length];
        prefixsum[0]= nums[0];

        TreeMap<Integer,Integer> map = new TreeMap<>();
        map.put(prefixsum[0],1);
        for (int i = 1; i < nums.length; i++) {
            prefixsum[i]=prefixsum[i-1]+nums[i];
            map.put(prefixsum[i],i+1);
        }

        int []ans = new int[queries.length];
        int i=0;
        for (int query:queries){
            Map.Entry<Integer,Integer> entry = map.floorEntry(query);
            if (entry!=null){
                ans[i]=entry.getValue();
            }
            i++;
        }
        return ans;
    }
}

package leetcode;

import java.util.*;

public class MajorityElementII_229 {
    public static void main(String[] args) {
        int [] nums = {1,2};
        System.out.println(majorityElement(nums));
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer>list = new ArrayList<>();
        HashMap<Integer,Integer>map= new HashMap<>();
        for (int i :nums) {
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }
        for (Map.Entry<Integer,Integer> entry :map.entrySet()){
            if (entry.getValue()>nums.length/3){
                list.add(entry.getKey()) ;
            }
        }
        return list;
    }
}

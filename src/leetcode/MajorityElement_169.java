package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int [] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i :nums){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }
        for (Map.Entry<Integer,Integer> entry :map.entrySet()){
            if (entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return -1;

    }
}

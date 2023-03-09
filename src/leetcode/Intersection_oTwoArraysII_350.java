package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Intersection_oTwoArraysII_350 {
    public static void main(String[] args) {
        int []nums1 = {9,4,9,8,4}, nums2 = {4,9,5};
        intersect(nums1,nums2);

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int i:nums1){
            if (map1.containsKey(i)){
                map1.put(i,map1.get(i)+1);
            }
            else {
                map1.put(i,1);
            }
        }
        for (int i:nums2){
            if (map2.containsKey(i)){
                map2.put(i,map2.get(i)+1);
            }
            else {
                map2.put(i,1);
            }
        }
        for (Integer key :map1.keySet()){
            if (map2.containsKey(key)){
                int x = Math.min(map1.get(key),map2.get(key));
                while (x-->0){
                    arr.add(key);
                }
            }
        }
        int []res = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i]=arr.get(i);
        }
        return res;
    }

}

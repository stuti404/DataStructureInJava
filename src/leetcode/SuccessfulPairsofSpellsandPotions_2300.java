package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class SuccessfulPairsofSpellsandPotions_2300 {
    public static void main(String[] args) {
        int []spells = {5,1,3}, potions = {1,2,3,4,5};
        int success = 7;
        int [] nums =successfulPairs(spells,potions,success);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
//    public static int[]  successfulPairs(int[] spells, int[] potions, long success) {
//        int [] ans = new int[spells.length];
//        for (int i = 0; i < spells.length; i++) {
//            int count =0;
//            for (int j = 0; j < potions.length; j++) {
//                if (((long) spells[i] * potions[j]) >= success) {
//                    count++;
//                }
//            }
//            ans[i]=count;
//        }
//        return ans;
//    }
    public static int[]  successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int []ans =new int[spells.length];
        for (int i = 0; i < spells.length; ++i) {
            ans[i]=potions.length-firstSuccessfulIndex(spells[i],potions,success);
        }
        return ans;
    }
    private static int  firstSuccessfulIndex(int spell,int[]potion,long success){
        int l =0;
        int r =potion.length;
        while (l<r){
            final int mid = (l+r)/2;
            if ((long) spell *potion[mid]>=success){
                r =mid;
            }
            else {
                l = mid-1;
            }
        }
        return l;
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {
    public static void main(String[] args) {
        int []candidates = {2,3,6,7};
        List<Integer> ls = new ArrayList<>();
        combinationSum(candidates,5,0,ls,0);
    }
    public static void combinationSum(int[] candidates, int target, int i, List<Integer>ls,int ans) {
        if(i==candidates.length){
//            System.out.println(ans);
            ls.get(i);
            return ;
        }
        if (ans==target){
            ls.add(candidates[i]);
            ls.get(i);
        }
        combinationSum(candidates,target,i+1,ls,ans+1);
        combinationSum(candidates,target,i+1,ls,ans);
    }
}

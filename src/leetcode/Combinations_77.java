package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations_77 {
    public List<List<Integer>> combine(int n, int k) {
        if(k>n )return  new ArrayList<>();
        List<List<Integer>>result = new ArrayList<>();
        combination(1,n,k,new ArrayList<>(),result);
        return result;

    }
    public static void combination(int i,int n,int k,List<Integer>comb,List<List<Integer>>result){
        if (k==0){
            result.add(new ArrayList<>(comb));
            return;
        }
        for (int x = i; x <=n ; x++) {
            comb.add(x);
            combination(x+1,n,k-1,comb,result);
            comb.remove(comb.size()-1);
        }
    }
}

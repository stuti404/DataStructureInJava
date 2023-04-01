package leetcode;

import java.util.*;

public class ReducingDishes_1402 {
    public static void main(String[] args) {
        int []satisfaction = {-1,-8,0,5,-9};
        System.out.println(maxSatisfaction(satisfaction));
    }
//    public static int maxSatisfaction(int[] satisfaction) {
//        Arrays.sort(satisfaction );
//        return max(satisfaction,0,0 );
//    }
//    public static int max(int[] satisfaction,int ans,int i){
//        if (i == satisfaction.length){
//            return 0;
//        }
//        int a = satisfaction[i]*(ans+1)+max(satisfaction,ans+1,i+1);
//        int b = max(satisfaction,ans,i+1);
//        return Math.max(a,b);
//    }
public static int maxSatisfaction(int[] satisfaction) {
    Arrays.sort(satisfaction );
    int a=0,b =0,n = satisfaction.length;
    for(int i =n-1;i>=0 && satisfaction[i]+a>0;i--){
        a+=satisfaction[i];
        b+=a;
    }
    return b;
}

}

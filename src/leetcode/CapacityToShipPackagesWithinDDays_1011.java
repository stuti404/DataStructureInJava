package leetcode;
public class CapacityToShipPackagesWithinDDays_1011 {
    public static void main(String[] args) {
        int []weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights,days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int lo =0;
        int hi = 0;
        for (int i = 0; i < weights.length; i++) {
            hi = hi+weights[i];
        }
        int ans =0;
        while (lo<=hi){
            int mid = (lo+hi)/2;

            if (isPossible(weights, days, mid)){
                ans = mid;
                hi=mid-1;
            }
            else {
                lo = mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] weight,int days,int mid){
        int d =1;
        int w =0;
        int i =0;
        while (i<weight.length){
            if (w+weight[i]<=mid){
                w = w+weight[i];
                i++;
            }
            else {
                d++;
                w=0;
            }
            if (d>days){
                return false;
            }
        }
        return true;
    }
}

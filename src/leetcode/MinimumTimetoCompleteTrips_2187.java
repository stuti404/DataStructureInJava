package leetcode;

public class MinimumTimetoCompleteTrips_2187 {
    public long minimumTime(int[] time, int totalTrips) {
        long low =Long.MAX_VALUE;
        long high =0;
        for (int i:time){
            low =  Math.min(low,i);
        }
        high = low*totalTrips;
        while (low<high){
            long mid = low+(high-low)/2;
            if (check(mid,time,totalTrips)){
                high=mid;
            }
            else {
                low= mid+1;
            }
        }
        return low;
    }
    public static boolean check(long mid,int[]time,int total){
        long trip =0;
        for (int i:time){
            trip+=mid/i;
        }
        if (trip>=total){
            return true;
        }
        return false;
    }
}

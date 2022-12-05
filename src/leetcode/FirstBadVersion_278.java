package leetcode;

public class FirstBadVersion_278 {
    public int firstBadVersion(int n) {
        int lo =1;
        int hi =n;
        int ans = 0;
        while(lo<=hi){
            int mid = (hi-lo)/2+lo;
            if(isBadVersion(mid)==true){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }

        }
        return ans;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }
}

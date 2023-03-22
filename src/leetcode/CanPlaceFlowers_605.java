package leetcode;

public class CanPlaceFlowers_605 {
    public static void main(String[] args) {
        int []flowerbed = {1,0,0,0,1};
        int n = 1;
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n==0){
            return true;
        }
        for (int i = 0; i <flowerbed.length ; ++i) {
            if (flowerbed[i]==0 &&(i==0 || flowerbed[i-1]==0)&&(i==flowerbed.length-1 ||flowerbed[i+1]==0)){
                flowerbed[i]=1;
                if (--n==0){
                    return true;
                }
            }

        }
        return false;
    }

}

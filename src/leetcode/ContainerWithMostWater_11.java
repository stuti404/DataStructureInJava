package leetcode;

public interface ContainerWithMostWater_11 {
    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        max_height(arr);
    }
    public static int max_height(int[] arr){
        int i =0;
        int j = arr.length-1;
        int ans =0;
        while(i<j){
            int minheght = Math.min(arr[i],arr[j]);
            int area =  minheght*(j-i);
            ans = Math.max(area,ans);
            if (arr[i] < arr[j]){
                i++;
            }
           else {
                j--;
            }
        }
        return ans;
    }

}

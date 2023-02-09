package leetcode;

public class TwoSumII_InputArrayIsSorted_167 {
    public static void main(String[] args) {
        int []arr ={0,0,1};
        int target = 0;
        twoSum(arr,target);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int []arr = new int[2];
        int i =0;
        int j = numbers.length-1;
        while (i<j){
            int sum =numbers[i]+numbers[j];
            if (sum>target) {
                j--;
            }
            else if (sum<target) {
                i++;
            }
            else {
                arr[0]=i;
                arr[1]=j;
            }
        }
        return arr;
    }
}

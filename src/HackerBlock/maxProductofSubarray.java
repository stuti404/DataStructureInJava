package HackerBlock;

public class maxProductofSubarray {
    public static void main(String[] args) {
        int []arr = {10,20,2,3,17,5,18,12,25};
        int k  =3;
        maxProduct(arr,k);
    }
    public static void maxProduct(int[]arr,int k){
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = arr[i]+sum;
        }
        int max = sum;
        for (int i = k; i < arr.length ; i++) {
            sum = sum-arr[i-k];
            sum = sum+arr[i];
            max = Math.max(sum,max);
        }
        System.out.println(max);
    }

}

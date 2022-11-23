package leetcode;

public class ProductofArrayExceptSelf_238 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        product(arr);
    }
    public static void product(int []arr){
        int [] left = new int[arr.length];
        left[0]=1;
        for (int i = 1; i < arr.length; i++) {
            left[i]=left[i-1]*arr[i-1];
        }
        int [] right = new int[arr.length];
        right[right.length-1]=1;
        for (int i = right.length-2; i >= 0; i--) {
            right[i]=right[i+1]*arr[i+1];
        }
        for (int i = 0; i < left.length; i++) {
            left[i]=left[i]*right[i];
        }
    }
}

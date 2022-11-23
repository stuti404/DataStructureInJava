package leetcode;

public class RotateArray_189 {
    public static void main(String[] args) {
        int []arr = {-1,-100,3,99};
        int k = 2;
        rotate(arr,  k);

    }

    public static void rotate(int[]arr,int k) {
        int x = k%arr.length;
        swipe(arr,0, arr.length-x-1);
        swipe(arr,arr.length-x, arr.length-1);
        swipe(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void swipe(int [] arr,int i ,int j){
        while (i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}

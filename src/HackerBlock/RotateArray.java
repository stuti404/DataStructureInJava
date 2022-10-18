package HackerBlock;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {-1};
        int k = 2;
        int rotate = k%arr.length;
        element(arr,rotate);
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void element (int [] arr, int rotate){
        int n = arr.length-rotate;
        reverse(arr,n, arr.length-1);
        reverse(arr,0,n-1);
        reverse(arr,0,arr.length-1);

    }
    public static  void reverse(int []arr, int i , int j){
        while (i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

package classroom_qps;

public class ratate_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);
    }
    public static void rotate(int[]arr, int k){
        int n = k% arr.length;
        swap(arr,0, arr.length-n-1);
        swap(arr, arr.length-n, arr.length-1);
        swap(arr,0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int [] swap(int []arr,int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}

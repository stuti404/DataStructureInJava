package classroom_qps;

public class Min_val {
    public static void main(String[] args) {
        int [] arr = {2,-1,3,5,4,-3,11,5};
        System.out.println(min_val(arr));
    }
    public static int min_val(int []arr){
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}

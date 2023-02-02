package classroom_qps;

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] arr = {5,3,-7,4,8,2};
        sort(arr);
    }

    public static void sort(int [] arr) {
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

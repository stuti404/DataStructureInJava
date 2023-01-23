package classroom_qps;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = {2,-1,3,5,4,-3,11,5};
        reverse(arr);
    }
    public static void reverse(int []arr){
        int i =2;
        int j = 6;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}

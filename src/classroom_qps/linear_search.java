package classroom_qps;

public class linear_search {
    public static void main(String[] args) {
        int [] arr = {2,-1,3,5,4,-3,11,5};
        int k = -3;
        System.out.println(search(arr,k));

    }
    public static int search(int []arr,int k){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}

package HackerBlock;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int []arr ={-4 ,-1 ,0 ,3 ,10};
        sort(arr);
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sqr(int []arr){
        for (int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
        }
    }
    //bubble sort
    public static void sort(int []arr){
        sqr(arr);
        for (int turn =0; turn<arr.length;turn++){
            for (int i =0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
}

package HackerBlock;

public class MaximumSumPathinTwoArrays {
    public static void main(String[] args) {
        int [] arr = {2, 3, 7, 10, 12, 15, 30, 34};
        int [] brr = {1 ,5 ,7 ,8 ,10 ,15 ,16 ,19};
        maxPath(arr,brr);
    }
    public static void maxPath(int[] arr,int brr[]){
        int i =0;
        int j =0;
        int p=0;
        int q =0;
        int ans =0;
        while(i<arr.length && j< brr.length){
            if (arr[i]<brr[j]){
                i++;
            } else if (arr[i]>brr[j]) {
                j++;
            }
            else {
                int sum1=0;
                int sum2=0;

                for (int k=p;k<=i;k++){
                    sum1 = sum1+arr[k];
                }
                for (int k=q;k<=j;k++){
                    sum2 = sum2+brr[k];
                }
                ans = ans + Math.max(sum2,sum1);

                i++;
                j++;
                p=i;
                q=j;
            }

        }
        if(i== arr.length){
            for (int k = q;k<brr.length;k++){
                ans = ans+brr[k];
            }
        }
        if(j==brr.length){
            for (int k= p;k< arr.length;k++){
                ans = ans+arr[k];
            }
        }
        System.out.println(ans);
    }
}

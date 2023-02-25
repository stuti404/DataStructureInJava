package HackerBlock;

public class Subset_problem_Recursion {
    public static void main(String[] args) {
        int []arr={1,2,3};
        int target =3;
        System.out.println("\n"+Subset( arr,"",0,target,0));
    }

    public static int Subset(int []arr,String ans,int i,int target,int sum) {
        if (i== arr.length){
            if (sum==target){
                System.out.print(ans);
                return 1;
            }
            return 0;
        }
        int c1= Subset(arr,ans+arr[i]+" ",i+1,target,sum+arr[i]);
        int c2 = Subset(arr,ans,i+1,target,sum);
        return c2+c1;
    }
}

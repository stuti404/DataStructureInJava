package HackerBlock;

public class IsArmstrongNumber {
    public static void main(String[] args) {
        int n =1634;
        int count =0;
        System.out.println(check(n,count));
        if (check(n,count)==n){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    public static int power (int n , int count ){
        while (n>0){
            count++;
            n = n/10;
        }
        return count;
    }
    public static int check (int n, int count ){
        int sum =0;
        int p = power(n,count);
        while (n>0){
            int rem =n%10;
            sum = (int)(sum+Math.pow(rem,p));
            n=n/10;
        }
        return sum;
    }
}

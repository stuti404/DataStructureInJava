package HackerBlock;

public class Sumofoddplacedandevenplaceddigits {
    public static void main(String[] args) {
        int n = 4568;
        int odd = 0;
        int even = 0;
        int val =1;
        while(n>0){
            int rem = n%10;
            if(val%2==0){
                even = even+rem;
            }
            else {
                odd =odd+rem;
            }
            val++;
            n = n/10;
        }
        System.out.println(odd);
        System.out.println(even);
    }
}

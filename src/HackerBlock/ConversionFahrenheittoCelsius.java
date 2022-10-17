package HackerBlock;

public class ConversionFahrenheittoCelsius {
    public static void main(String[] args) {
        int Start = 0;
        int end = 100;
        int gap =20;

        for (int i=Start;i<=end;i=i+gap){
            int c = (5*(i-32))/9 ;
            System.out.println(i+" "+c);
        }
    }
}

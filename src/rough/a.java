package rough;

import java.util.*;

public class a {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] alpha = new char[n][m];
        for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < alpha[0].length; j++) {
                alpha[i][j] = sc.next().charAt(0);
            }
        }
        name(alpha, alphabet);

    }

    public static void name( char[][] alpha, char alphabet) {

        for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < alpha[0].length; j++) {
                if(alpha[i][j]==alphabet) {

                    for (int k = 0; k<j; k++) {
                        System.out.print(alpha[i][k]);
                    }
                    System.out.println();
                    for (int l = 0; l <i; l++) {
                        System.out.print(alpha[l][j]);
                    }

                }
            }
        }

    }

}


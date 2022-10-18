package HackerBlock;

import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);

            if(s>='a' && s<='z'){
                System.out.println("lowercase");
            }
            else if (s>='A' && s<='Z'){
                System.out.println("UPPERCASE");
            }
            else {
                System.out.println("Invalid");
            }

    }
}

package HackerBlock;

public class StringsRemoveDuplicates {
    public static void main(String[] args) {
        String s = "aabccba";
        System.out.println(remove(s));
    }
    public  static String remove(String s){
        String s1 = s.charAt(0)+"";
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if (curr != prev){
                s1 = s1+curr;
            }
        }
        return s1;
    }

}

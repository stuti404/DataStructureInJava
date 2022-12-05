package leetcode;

public class DetermineifStringHalvesAreAlike_1704 {
    public static void main(String[] args) {
        String s1 = "bIoAUk";
        System.out.println(Halves(s1));
    }
    public static boolean Halves(String s){
        int x = s.length()/2;
        int find1=0;
        int find2 =0;
        for (int i = 0; i < x; i++) {
            char ch =s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') {
                find1++;
            }
        }
        for (int i = x; i <s.length() ; i++) {
            char ch =s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U') {
                find2++;
            }
        }
        if (find1==find2){
            return true;
        }
        return false;
    }

}

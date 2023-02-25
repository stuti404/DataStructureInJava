package leetcode;
import java.util.*;
public class GenerateParentheses_22 {
    public static void main(String[] args) {
        int n =3;
        List<String>list = new ArrayList<>();
        generate(n,"",0,0,list);
    }
    public List<String> generateParenthesis(int n) {
        List<String>list = new ArrayList<>();
        generate(n,"",0,0,list);
        return list;
    }
    public static void generate(int n,String ans,int open,int close,List<String>list){
        if (open==n && close==n){
            list.add(ans);
            return;
        }
        if (open<n) {
            generate(n, ans + "(", open + 1, close,list);
        }
        if (close<open) {
            generate(n, ans + ")", open, close + 1,list);
        }
    }
}

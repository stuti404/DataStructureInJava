package leetcode;

import java.util.HashMap;

public class UniquePaths_62 {
    public static void main(String[] args) {
        int m =3;
        int n =2;
        System.out.println(uniquePaths(m,n));
    }
    public static int uniquePaths(int m, int n) {
        HashMap<String ,Integer> map = new HashMap<>();
        return path(0,m-1,0,n-1,map);
    }
    public static int path(int cr, int er, int cc, int ec, HashMap<String,Integer> map){
        String key = cr+"&"+cc;
        if (map.containsKey(key))
            return map.get(key);
        if (cr>er || cc>ec){
            return 0;
        }
        if (cr==er && cc==ec){
            return 1;
        }
        int a =path(cr+1,er,cc,ec,map);
        int b =path(cr,er,cc+1,ec,map);
        map.put(key,a+b);
        return a+b;
    }
}

package GFG;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeekandStrings {
    public static List<Integer> prefixCount(int N, int Q, String li[], String query[])
    {
        Map<String,Integer> map = new HashMap<>();
        for (String s: query){
            map.put(s,0);
        }
        for (String s :li){
            StringBuilder sb = new StringBuilder();
            for (char c:s.toCharArray()){
                sb.append(c);
                if (map.containsKey(sb.toString())){
                    map.put(sb.toString(),map.get(sb.toString())+1);
                }
            }
        }
        List <Integer> ans = new ArrayList<>();
        for (String s: query){
            ans.add(map.get(s));
        }
        return ans;
    }
}

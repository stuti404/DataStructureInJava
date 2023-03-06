package leetcode;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Triangl_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int sum = 0;
                if (j==0){
                    sum = triangle.get(i).get(j)+triangle.get(i-1).get(j);
                } else if (j==triangle.get(i).size()-1) {
                    sum= triangle.get(i).get(j)+triangle.get(i-1).get(triangle.get(i-1).size()-1);
                }
                else {
                    int mini = Math.min(triangle.get(i-1).get(j),triangle.get(i-1).get(j-1));
                    sum = mini+triangle.get(i).get(j);
                }
                triangle.get(i).set(j,sum);
            }
        }
        return Collections.min(triangle.get(triangle.size()-1));
    }
}

package leetcode;

import java.util.*;

public class PossibleBipartition_886 {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int [] color = new int[n+1];
        List<Integer>[] graph = new List[n+1];
        for (int i = 0; i <=n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int []v:dislikes){
            graph[v[0]].add(v[1]);
            graph[v[1]].add(v[0]);
        }

        for (int i = 1; i <=n ; i++) {
            if (color[i]==0){
                LinkedList<Integer>queue = new LinkedList<>();
                queue.add(i);
                color[i]=1;
                while (queue.size()!=0){
                    int top = queue.removeFirst();
                    for (int nei :graph[top]){
                        if (color[nei] == color[top]) return false;
                        if (color[nei]==0){
                            color[nei] =-color[top];
                            queue.add(nei);
                        }
                    }
                }
            }
        }
        return true;
    }
}

package leetcode;

import java.util.*;


public class Find_ifPathExists_inGraph_1971 {
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Depth first search
        if (source==destination){
            return true;
        }
        HashMap<Integer, List<Integer>> graph  = new HashMap<>();
        boolean[] visted = new boolean[n];
        for (int i = 0; i < n; i++) {
            graph.put(i,new ArrayList());
        }
        for (int []edge :edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        dfs(graph,visted,source,destination);
        return found;
    }
    private void dfs(HashMap<Integer,List<Integer>>graph,boolean[] visited,int source,int destination){
        if (visited[source]==true||found){
            return;
        }
        visited[source]=true;
        for (int node :graph.get(source)){
            if (node==destination){
                found =true;
                break;
            }
            if (!visited[node]){
                dfs(graph,visited,node,destination);
            }
        }
    }
}

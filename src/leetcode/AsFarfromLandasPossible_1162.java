package leetcode;
import java.util.*;
public class AsFarfromLandasPossible_1162 {
    public static void main(String[] args) {
        int [][]grid= {{1,0,1},{0,0,0},{1,0,1}};

    }
    public int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges) {
        Map<Integer, List<Integer>> redMap = constructMap(red_edges);
        Map<Integer, List<Integer>> blueMap = constructMap(blue_edges);
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][2];
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        queue.offer(new int[]{0, 0});
        queue.offer(new int[]{0, 1});
        visited[0][0] = visited[0][1] = true;

        int step = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                ans[curr[0]] = ans[curr[0]] == -1 ? step : Math.min(ans[curr[0]], step);
                if (curr[1] == 0) {
                    if (blueMap.containsKey(curr[0])) {
                        for (int neig : blueMap.get(curr[0])) {
                            if (visited[neig][1]) continue;
                            queue.offer(new int[]{neig, 1});
                            visited[neig][1] = true;
                        }
                    }
                } else {
                    if (redMap.containsKey(curr[0])) {
                        for (int neig : redMap.get(curr[0])) {
                            if (visited[neig][0]) continue;
                            queue.offer(new int[]{neig, 0});
                            visited[neig][0] = true;
                        }
                    }
                }
            }
            step++;
        }
        return ans;
    }

    private Map<Integer, List<Integer>> constructMap(int[][] edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] edge : edges) {
            map.computeIfAbsent(edge[0], x -> new ArrayList<>()).add(edge[1]);
        }
        return map;
    }
}

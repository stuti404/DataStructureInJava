package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Matrix01_542 {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] ==0){
                    q.offer(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        int [][] dir = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        while (q.size()>0){
            int []xy = q.poll();
            for (int []d:dir) {
                int nx = xy[0]+d[0];
                int ny = xy[1]+d[1];
                if (nx >=0 && nx<m && ny >=0 && ny<n && !visited[nx][ny]){
                    mat[nx][ny]= mat[xy[0]][xy[1]]+1;
                    q.offer(new int[]{nx,ny});
                    visited[nx][ny]=true;
                }
            }
        }
        return mat;
    }
}

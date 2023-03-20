package leetcode;

public class WhereWilltheBallFall_1706 {
    public static void main(String[] args) {
        int[][]grid ={{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
    }
    public static int[] findBall(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int [] arr = new int[m];
        for (int j = 0; j < m; j++) {
            int cpos = j;
            int npos = -1;
            for (int i = 0; i < n; i++) {
                npos=cpos+grid[i][cpos];
                if (npos<0||npos>=m||grid[i][cpos]!=grid[i][npos]){
                    cpos=-1;
                    break;
                }
                cpos=npos;
            }
            arr[j]=cpos;
        }
        return arr;
    }
}

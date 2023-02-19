package leetcode;

public class MaxAreaofIsland_695 {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int maxArea =0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j]==1){
                    maxArea= Math.max(maxArea,getCurrentArea(i,j,grid));
                }
            }
        }
        return maxArea;
    }
    public static int getCurrentArea(int i,int j,int[][]grid){
        if (i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]<=0){
            return 0;
        }
        grid[i][j]=-1;
        int leftArea =getCurrentArea(i,j-1,grid);
        int rightArea = getCurrentArea(i,j+1,grid);
        int upArea = getCurrentArea(i-1,j,grid);
        int downArea= getCurrentArea(i+1,j,grid);

        int totalArea = leftArea+rightArea+upArea+downArea;
        return 1+totalArea;
    }
}

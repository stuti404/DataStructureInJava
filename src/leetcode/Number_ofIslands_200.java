package leetcode;

public class Number_ofIslands_200 {
    public int numIslands(char[][] grid) {
        int count =0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1'){
                    dfsGrid(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfsGrid(char[][]grid,int i,int j){
        if (i>=0 && j>=0 && i<grid.length && j<grid[0].length&& grid[i][j]=='1') {
            grid[i][j] = '0';
            dfsGrid(grid,i+1,j);
            dfsGrid(grid,i-1,j);
            dfsGrid(grid,i,j+1);
            dfsGrid(grid,i,j-1);
        }

    }
}

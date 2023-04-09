package leetcode;

public class Number_ofEnclaves_1020 {
    public static void main(String[] args) {
        int [][]grid = {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        System.out.println(numEnclaves(grid));
    }
    public static int numEnclaves(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i==0 ||j==0|| i == grid.length-1 ||j== grid[0].length-1){
                    if (grid[i][j]==1){
                        dfs(grid,i,j);
                    }
                }
            }
        }
        int count =0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(int[][]arr,int i ,int j){
        if (i<0||j<0||i>=arr.length||j>=arr[0].length ||arr[i][j]==0){
            return;
        }
        arr[i][j]=0;
        dfs(arr,i+1,j);
        dfs(arr,i,j+1);
        dfs(arr,i-1,j);
        dfs(arr,i,j-1);
    }
}

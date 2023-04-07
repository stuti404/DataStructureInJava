package leetcode;

public class Number_ofClosedIslands_1254 {
    public static void main(String[] args) {
        int [][]grid = {{1,1,1,1,1,1,1,0},{1,0,0,0,0,1,1,0},{1,0,1,0,1,1,1,0},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,0}};
        System.out.println(closedIsland(grid));
    }
    public static int closedIsland(int[][] grid) {
        int r = grid.length, c= grid[0].length;
        int closeIsland =0;
        for (int i = 1; i <r-1 ; i++) {
            for (int j = 1; j <c-1 ; j++) {
                if (grid[i][j]==0){
                    if (isClosed(grid,i,j,r,c)){
                        closeIsland++;
                    }
                }
            }
        }
        return closeIsland;
    }
    public static boolean isClosed(int [][]grid,int i,int j,int r,int c){
        if (grid[i][j]==1){
            return true;
        }
        if (isOnePerimeter(i,j,r,c)){
            return false;
        }
        grid[i][j]=1;
        boolean left = isClosed(grid,i,j-1,r,c);
        boolean right = isClosed(grid,i,j+1,r,c);
        boolean up = isClosed(grid,i-1,j,r,c);
        boolean down = isClosed(grid,i+1,j,r,c);
        return left && right && up && down;
    }
    private static boolean isOnePerimeter(int i, int j, int r, int c){
        return i==0 || j==0 || i==r-1||j==c-1;
    }
}

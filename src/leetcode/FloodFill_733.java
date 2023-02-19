package leetcode;

public class FloodFill_733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color == image[sr][sc]) return image;
        DFS(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public static void DFS(int[][]image,int row,int col,int color,int oldcolor){
        if (row >=image.length || row<0||col>=image[0].length ||col<0||image[row][col]!= oldcolor) return;
        image[row][col] = color;
        DFS(image,row-1,col,color,oldcolor);
        DFS(image,row+1,col,color,oldcolor);
        DFS(image,row,col-1,color,oldcolor);
        DFS(image,row,col+1,color,oldcolor);
    }
}

package leetcode;

public class SpiralMatrix_54 {
    public static void main(String[] args) {
        int [][]matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiralOrder(matrix);
    }
    public static void spiralOrder(int[][] matrix) {
        int minr=0;
        int minc =0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        int total = matrix.length*matrix[0].length;
        int c =0;
        while(c<total){
            for (int i = minc; i <=maxc && c<total ; i++) {
                System.out.print(matrix[minr][i]);
                c++;
            }
            minr++;
            for (int i = minr; i <=maxr && c<total; i++) {
                System.out.print(matrix[i][maxc]);
                c++;
            }
            maxc--;
            for (int i = maxc; i >=minc && c<total; i--) {
                System.out.print(matrix[maxr][i]);
                c++;
            }
            maxr--;
            for (int i = maxr; i >=minr && c<total; i--) {
                System.out.print(matrix[i][minc]);
                c++;
            }
            minc++;
        }
    }
}

package leetcode;

public class SpiralMatrixII_59 {
    public static void main(String[] args) {
        int n =3;
    }
    public int[][] generateMatrix(int n) {
        int t =0,b =n-1,l=0,r=n-1,d=0;
        int [][] matrix = new int[n][n];
        int num =1;
        while (l<=r && t<=b){
            if (d==0){
                for (int i = l; i <=r ; i++) {
                   matrix[t][i]=num;
                    num++;
                }
                d=1;
                t++;
            } else if (d==1){
                for (int i = t; i <=b ; i++) {
                    matrix[i][r]=num;
                    num++;
                }
                d=2;
                r--;
            } else if (d==2) {
                for (int i = r; i >=l ; i--) {
                    matrix[b][i]=num;
                    num++;
                }
                d=3;
                b--;
            } else if (d==3) {
                for (int i = b; i >=t ; i--) {
                    matrix[i][l]=num;
                    num++;
                }
                d=0;
                l++;
            }
        }
        return matrix;
    }
}

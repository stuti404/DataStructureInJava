package leetcode;

public class ConstructQuadTree_427 {
    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    };
    public Node construct(int[][] grid) {
        int n = grid.length;
        if (n==0)return null;
        return Helper(1,n,1,n,grid);
    }
    private Node Helper(int startx,int endx,int starty,int endy,int[][]grid){
        int val = grid[startx-1][starty-1];
        boolean isSame = true;
        for (int i = startx-1; i <=endx-1 ; i++) {
            for (int j = starty-1; j <=endy-1 ; j++) {
                if (grid[i][j]!=val){
                    isSame = false;
                    break;
                }
            }
            if (!isSame)break;
        }
        if (isSame){
            Node n = new Node(val==1?true:false,true,null,null,null,null);
            return n;
        }else {
            Node topleft = Helper(startx,(startx+endx-1)/2,starty,(starty+endy-1)/2,grid);
            Node topRight = Helper(startx,(startx+endx-1)/2,(starty+endy+1)/2,endy,grid);
            Node bottomleft = Helper((startx+endx+1)/2,endx,starty,(starty+endy-1)/2,grid);
            Node bottomright = Helper((startx+endx+1)/2,endx,(starty+endy+1)/2,endy,grid);
            Node n =new Node(false,false,topleft,topRight,bottomleft,bottomright);
            return n;
        }
    }
}

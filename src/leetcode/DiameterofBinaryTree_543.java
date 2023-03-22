package leetcode;

public class DiameterofBinaryTree_543 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  // solution one
    public int diameterOfBinaryTree(TreeNode root) {
        if (root ==null){
            return 0;
        }
        int sd = height(root.left)+height(root.right)+2;
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        return Math.max(sd,Math.max(ld,rd));
    }
    public static int height(TreeNode nn){
        if (nn == null){
            return -1;
        }
        int left = height(nn.left);
        int right = height(nn.right);
        return Math.max(left,right)+1;
    }
    //optimal solution
    public class DiaPair {
        int ht = -1;
        int d = 0;
    }
    public int diameterOfBinaryTree_opt(TreeNode root) {
        return diameter(root).d;
    }
    public DiaPair diameter(TreeNode root){
        if (root==null){
            return new DiaPair();
        }
        DiaPair ldp = diameter(root.left);
        DiaPair rdp = diameter(root.right);
        DiaPair sdp = new DiaPair();
        sdp.ht =Math.max(ldp.ht,rdp.ht)+1;
        int d = ldp.ht+rdp.ht+2;
        sdp.d = Math.max(d,Math.max(ldp.d,rdp.d));
        return sdp;
    }
}

package leetcode;

public class FlipEquivalentBinaryTrees_951 {
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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return isEqual(root1,root2);
    }
    private static boolean isEqual(TreeNode root1,TreeNode root2){
        if (root1==null && root2 == null){
            return true;
        }
        if (root1==null || root2==null){
            return false;
        }
        if (root1.val != root2.val){
            return false;
        }
        boolean fs = isEqual(root1.left,root2.right) && isEqual(root1.right,root2.left);
        boolean ss = isEqual(root1.left,root2.left)&& isEqual(root1.right,root2.right);
        return fs|| ss;
    }
}

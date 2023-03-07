package leetcode;

public class ValidateBinarySearchTree_98 {
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
    public static void main(String[] args) {

    }
    public boolean isValidBST(TreeNode root) {
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean valid(TreeNode node,long start,long end){
        if (node==null){
            return true;
        }
        if (start<node.val && node.val<end){
            return valid(node.left,start,node.val) && valid(node.right,node.val,end);
        }
        return false;
    }
}

package leetcode;

public class BinaryTreeMaximumPathSum_124 {
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

    class Solution {
        int maxSum = Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            findpath(root);
            return maxSum;
        }
        private int findpath(TreeNode root){
            if (root==null){
                return 0;
            }
            int left = Math.max(0,findpath(root.left));
            int right = Math.max(0,findpath(root.right));
            maxSum = Math.max(maxSum,left+right+root.val);
            return Math.max(left,right)+root.val;
        }
    }
}

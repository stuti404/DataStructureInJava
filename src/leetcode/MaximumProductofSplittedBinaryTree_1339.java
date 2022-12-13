package leetcode;

public class MaximumProductofSplittedBinaryTree_1339 {
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
        long max_product = Integer.MIN_VALUE;

        public int maxProduct(TreeNode root) {
            long totalSum = getcompleteTreesum(root);
            calculateSubtree(root,totalSum);
            return (int)(max_product%1000000007);
        }
        private long calculateSubtree(TreeNode root, long totalsum){
            if (root==null){
                return  0;
            }
            long leftsum = calculateSubtree(root.left,totalsum);
            long rightsum = calculateSubtree(root.right,totalsum);

            long currentsum = leftsum+rightsum+root.val;

            long currentProduct = ((totalsum-currentsum)*currentsum);
            max_product = Math.max(max_product,currentProduct);
            return currentsum;
        }
        private long getcompleteTreesum(TreeNode root){
            if (root== null){
                return 0;
            }
            return root.val+getcompleteTreesum(root.left)+getcompleteTreesum(root.right);
        }
    }
}

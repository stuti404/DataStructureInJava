package leetcode;

public class BalancedBinaryTree_110 {
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
    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }
        boolean lb = isBalanced(root.left);
        boolean rb = isBalanced(root.right);
        boolean sb = Math.abs(height(root.left)-height(root.right))<=1;
        return lb && rb && sb;
    }
    public static int height(TreeNode root){
        if (root==null){
            return -1;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;
    }

}

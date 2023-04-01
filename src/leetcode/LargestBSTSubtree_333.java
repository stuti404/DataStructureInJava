package leetcode;

public class LargestBSTSubtree_333 {
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
    public class BSTPair{
        int size =0;
        int min =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean isBST = true;
    }
    public int largestBSTSubtree(TreeNode root){
        return largestbst(root).size;
    }
    public BSTPair largestbst(TreeNode root){
        if (root==null){
            return new BSTPair();
        }
        BSTPair lbst = largestbst(root.left);
        BSTPair rbst = largestbst(root.right);
        BSTPair sbst = new BSTPair();
        sbst.min = Math.min(root.val,Math.min(lbst.min,rbst.min));
        sbst.max = Math.max(root.val,Math.max(lbst.max,lbst.max));
        if (lbst.isBST && rbst.isBST && lbst.max<root.val && rbst.min>root.val){
            sbst.isBST=true;
            sbst.size = lbst.size+rbst.size+1;
        }
        else {
            sbst.isBST=false;
            sbst.size = Math.max(lbst.size,rbst.size);
        }
        return sbst;
    }
}
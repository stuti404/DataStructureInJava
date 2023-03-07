package leetcode;

public class LowestCommonAncestor_of_aBinarySearchTree_235 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val>q.val){
            TreeNode temp = q;
            q=p;
            p=temp;
        }
        while (true){
            if (p.val==root.val ||q.val==root.val)return root;
            else if (p.val<=root.val && q.val>=root.val) return root;
            else if (p.val<=root.val && q.val<=root.val) root= root.left;
            else if (p.val>=root.val && q.val>=root.val) root= root.right;
        }
    }
}

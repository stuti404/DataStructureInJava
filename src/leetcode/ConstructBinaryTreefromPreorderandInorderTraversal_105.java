package leetcode;

import BinaryTree.createTreePreIn;

public class ConstructBinaryTreefromPreorderandInorderTraversal_105 {
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

    public TreeNode buildTree(int[]preorder,int []inorder){
        return creattree(inorder,0,inorder.length-1,preorder,0,preorder.length-1);
    }
    public TreeNode creattree(int[] inorder, int ilo, int ihi, int[] preorder, int plo, int phi){
        if(ilo>ihi || plo>phi){
            return null;
        }
        TreeNode node = new TreeNode(preorder[plo]);

        int idx = search(inorder,ilo,ihi,preorder[plo]);
        int nlc = idx-ilo;
        node.left = creattree(inorder,ilo,idx-1,preorder,plo+1,plo+nlc);
        node.right= creattree(inorder,idx+1,ihi,preorder,plo+nlc+1,phi);
        return node;
    }
    public static int search(int []inorder,int si,int ei,int item){
        for (int i = si; i <=ei ; i++) {
            if (inorder[i]==item){
                return i;
            }
        }
        return 0;
    }
}

package leetcode;

import javax.swing.tree.TreeNode;

public class PathSum_112 {
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

    public static boolean pathsum(TreeNode root,int targetsum) {
        if(root== null){
            return false;
        }
        if(root.left==null&&root.right==null){
            return  (targetsum-root.val)==0;
        }
        return pathsum(root.left,targetsum-root.val)|| pathsum(root.right,targetsum- root.val);
    }
}

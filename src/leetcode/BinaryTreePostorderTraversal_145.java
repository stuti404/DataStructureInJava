package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal_145 {
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list = new ArrayList<>();
        return prehelper(root,list);
    }
    public List<Integer> prehelper(TreeNode root,List<Integer>list) {
        if (root==null) return list;
        prehelper(root.left,list);
        prehelper(root.right,list);
        list.add(root.val);
        return  list;
    }

}

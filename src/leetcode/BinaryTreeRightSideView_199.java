package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView_199 {
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
      static int dept = -1;

      public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightSide(root,list,0);
        return list;
      }

      public static void rightSide(TreeNode root, List<Integer> list, int cl) {
          if (root==null){
              return;
          }
          if (dept<cl){
              list.add(root.val);
              dept=cl;
          }
          rightSide(root.right,list,cl+1);
          rightSide(root.left,list,cl+1);
      }
  }
}

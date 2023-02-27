package leetcode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal_102 {
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result =new ArrayList<>();
        if (root ==null)return result;
        Queue<TreeNode>q =new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> currlevel = new ArrayList<>();
            while (size-- >0){
                TreeNode xurr = q.poll();
                currlevel.add(xurr.val);
                if (xurr.left != null)q.offer(xurr.left);
                if (xurr.right!= null)q.offer(xurr.right);
            }
            result.add(currlevel);
        }
        return result;
    }
}

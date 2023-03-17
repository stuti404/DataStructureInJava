package leetcode;

import java.security.cert.TrustAnchor;
import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessofaBinaryTree_958 {
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
        public boolean isCompleteTree(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            boolean notSeen = false;
            while (!q.isEmpty()){
                TreeNode curr = q.poll();
                if (curr == null){
                    notSeen = true;
                }
                else {
                    if (notSeen){
                        return false;
                    }
                    q.offer(curr.left);
                    q.offer(curr.right);
                }
            }
            return true;
        }
  }
}

package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees_872 {
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
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            List<Integer> leaves1 = new ArrayList();
            List<Integer> leaves2 = new ArrayList();
            dfs(leaves1,root1);
            dfs(leaves2,root2);
            return leaves1.equals(leaves2);
        }
        public void dfs(List<Integer> leafvalue,TreeNode root){
            if (root ==null){
                return;
            }
            if (root.left ==null && root.right ==null){
                leafvalue.add(root.val);
            }
            dfs(leafvalue, root.left);
            dfs(leafvalue,root.right);
        }
    }
}

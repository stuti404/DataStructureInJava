package leetcode;

import java.util.ArrayList;
import java.util.List;

public class N_aryTreePreorderTraversal {
    class Node {
        public int val;
        public List<Node> children;

    public Node() {}

    public Node(int _val) {
            val = _val;
        }

    public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    List<Integer> result=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root==null){
            return  result;
        }
        preorderHelper(root);
        return result;
    }
    public void preorderHelper(Node node){
        if (node.children==null) return;
        result.add(node.val);
        for(Node child :node.children){
            preorderHelper(child);
        }
    }
}

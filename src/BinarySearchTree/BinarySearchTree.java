package BinarySearchTree;

import BinaryTree.BinaryTree;

public class BinarySearchTree {
    public class Node{
        int val;
        Node right;
        Node left;
    }
    private Node root;
    public BinarySearchTree(int[] in){
        root =CreatTree(in,0,in.length-1);
    }
    private Node CreatTree(int[]in,int si,int ei){
        if (si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node nn =new Node();
        nn.val= in[mid];
        nn.left= CreatTree(in,si,mid-1);
        nn.right =CreatTree(in,mid+1,ei);
        return nn;
    }
    public void display(){
        display(root);
    }
    private void display(Node nn){
        if (nn == null){
            return;
        }
        String s="";
        s ="<--"+nn.val+"-->";
        if (nn.left!=null){
            s= nn.left.val+s;
        }else {
            s = "."+s;
        }
        if (nn.right!=null){
            s= s+nn.right.val;
        }else {
            s = s+". ";
        }
        System.out.println(s);
        display(nn.left);
        display(nn.right);
    }

    public static void main(String[] args) {
        int[] in= {10,20,30,40,50,60,70,80,90};
        BinarySearchTree bst = new BinarySearchTree(in);
        bst.display();
    }
}

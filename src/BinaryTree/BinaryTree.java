package BinaryTree;

import java.util.Map;
import java.util.Scanner;

public class BinaryTree {
    private class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc = new Scanner(System.in);
    BinaryTree(){
        this.root = CreatTree();
    }
    private Node CreatTree(){
        int item = sc.nextInt();
        Node n  = new Node();
        n.data =item;
        boolean hlc= sc.nextBoolean();
        if (hlc){
            n.left=CreatTree();
        }
        boolean hrc= sc.nextBoolean();
        if (hrc){
            n.right=CreatTree();
        }
        return n;
    }
    public void display(){
        display(root);
    }
    private void display(Node nn){
        if (nn == null){
            return;
        }
        String s="";
        s ="<--"+nn.data+"-->";
        if (nn.left!=null){
            s= nn.left.data+s;
        }else {
            s = "."+s;
        }
        if (nn.right!=null){
            s= s+nn.right.data;
        }else {
            s = s+". ";
        }
        System.out.println(s);
        display(nn.left);
        display(nn.right);
    }
    public void postorder(){
        postorder(root  );
        System.out.println();
    }
    private void postorder(Node nn){
        if (nn ==null){
            return;
        }
        postorder(nn.left);
        postorder(nn.right);
        System.out.print(nn.data+" ");
    }
    public void inorder(){
        inorder(root);
        System.out.println();
    }
    private void inorder(Node nn) {
        if (nn == null) {
            return;
        }
        inorder(nn.left);
        System.out.print(nn.data + " ");
        inorder(nn.right);
    }
    public void preorder(){
        preorder(root);
        System.out.println();
    }
    private void preorder(Node nn){
        if (nn == null) {
            return;
        }
        System.out.print(nn.data+" ");
        preorder(nn.left);
        preorder(nn.right);
    }
    public  boolean find(int item){
        return find(root,item);
    }
    private boolean find(Node nn,int item){
        if (nn ==null){
            return false;
        }
        if (nn.data==item){
            return true;
        }
        boolean lf = find(nn.left,item);
        boolean rf = find(nn.right,item);
        return lf||rf;
    }
    public int max(){
       return max(root);
    }
    private int max(Node nn){
        if (nn==null){
            return Integer.MIN_VALUE;
        }
        int left = max(nn.left);
        int right = max(nn.right);
        return Math.max(nn.data,Math.max(left,right));
    }
    public int height(){
        return height(root);
    }
    private int height(Node nn){
        if (nn==null){
            return -1;
        }
        int left = height(nn.left);
        int right = height(nn.right);
        return Math.max(left,right)+1;
    }
}

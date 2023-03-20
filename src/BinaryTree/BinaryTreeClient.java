package BinaryTree;

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
//        10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        bt.display();
        bt.postorder();
        bt.inorder();
        bt.preorder();
        System.out.println(bt.find(4));
        System.out.println(bt.max());
        System.out.println(bt.height());
    }
}

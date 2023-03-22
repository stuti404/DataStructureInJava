package leetcode;
class treeNode
{
    int value;
    treeNode left, right;
    public treeNode(int x)
    {
        value= x;
        left = right = null;
    }
}
public class Sum_ofLeftLeaves_404 {


    public static void main(String args[])
    {
        treeNode root = new treeNode(1);
        root.left = new treeNode(2);
        root.right = new treeNode(3);
        root.left.left= new treeNode(4);
        root.left.right= new treeNode(5);
//        root.right.left = new treeNode(15);
//        root.right.right =  new treeNode(7);
        System.out.println("Sum is " + sumOfLeftLeaves(root));
    }
    static int count = 0;
    public static int sumOfLeftLeaves(treeNode root) {
        count = 0;

        if(root.left==null && root.right==null) {
            return count;
        }

        return sumOfLeftLeafNodes(root);
    }

    public static int sumOfLeftLeafNodes(treeNode root) {
        if(root.left==null && root.right==null)
            return root.value;


        int left = 0;
        if(root.left!=null)
        {
            left = sumOfLeftLeafNodes(root.left);
        }
        if(left>0)
            count = count + left;

        int right = 0;
        if(root.right!=null)
            right = sumOfLeftLeafNodes(root.right);
        return count;
    }
}

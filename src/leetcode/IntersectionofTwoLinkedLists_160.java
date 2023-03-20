package leetcode;

public class IntersectionofTwoLinkedLists_160 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public static void main(String[] args) {
        int [] listA = {4,1,8,4,5}, listB = {5,6,1,8,4,5};
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a!=b){
            if (a==null){
                a=headB;
            }else {
                a = a.next;
            }
            if (b==null){
                b = headA;
            }else {
                b = b.next;
            }
        }
        return b;
    }
}

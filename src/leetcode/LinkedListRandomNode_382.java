package leetcode;

public class LinkedListRandomNode_382 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 ListNode head=null;
//    public Solution(ListNode head) {
//        this.head=head;
//    }

    public int getRandom() {
        ListNode curr = head;
        int i =1;
        int res =0;
        while (curr != null){
            if (Math.random()<1.0/i){
                res = curr.val;
            }
            i++;
            curr = curr.next;
        }
        return res;
    }
//    Solution obj = new Solution(head);
//  int param_1 = obj.getRandom();
}

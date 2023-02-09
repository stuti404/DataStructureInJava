package leetcode;

import org.w3c.dom.Node;

public class MergeTwoSortedLists_21 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while (list1!=null && list2!=null){
            if (list1.val <= list2.val){
                curr.next = list1;
                list1 =list1.next;
            }
            else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = list1 != null?list1:list2;
        return dummy.next;
    }
}

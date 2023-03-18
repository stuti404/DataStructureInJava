package leetcode;

import LinkedList.LinkedList;

import java.util.List;

public class SortList_148 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode sortList(ListNode head) {
        if (head ==null|| head.next==null){
            return head;
        }
        ListNode mid = middlenode(head);
        ListNode midnext = mid.next;
        mid.next = null;
        ListNode fs =sortList(head);
        ListNode ss= sortList(midnext);
        return mergeSort(fs,ss);

    }
    public ListNode mergeSort(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while (list1!=null && list2!=null){
            if (list1.val<list2.val){
                dummy.next = list1;
                dummy = dummy.next;
                list1= list1.next;
            }else {
                dummy.next= list2;
                dummy = dummy.next;
                list2=list2.next;
            }
        }
        if (list1!=null){
            dummy.next=list1;
        }
        if (list2!=null){
            dummy.next= list2;
        }
        return temp.next;
    }
    public static ListNode middlenode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next!=null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

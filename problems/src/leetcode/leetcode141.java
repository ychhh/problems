package leetcode;

import java.util.List;

public class leetcode141 {
    public boolean hasCycle(ListNode head) {
        if (head==null){
            return true;
        }
        ListNode fast=head;
        ListNode slow=head;
        while (fast.next!=null&&slow.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                return true;
            }
        }
        return false;

    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

package gaopin;
//判断链表中是否有环
public class hasCycle {
    public boolean hasCycle(ListNode head) {
        if (head==null)
            return false;
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
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

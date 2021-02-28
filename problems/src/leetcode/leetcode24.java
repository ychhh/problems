package leetcode;

public class leetcode24 {
//    public ListNode swapPairs(ListNode head) {
//        if (head==null||head.next==null){
//            return head;
//        }
//        ListNode next=head.next;
//        head.next=swapPairs(next.next);
//        next.next=head;
//        return next;
//    }
    public ListNode swapPairs(ListNode head) {
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode t=pre.next;
        while (t.next!=null&&t.next.next!=null){
            ListNode start=t.next;
            ListNode end=t.next.next;
            t.next=end;
            start.next=end.next;
            end.next=start;
            t=start;
        }
        return pre.next;
}
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

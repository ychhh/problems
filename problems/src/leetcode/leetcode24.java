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
        if (head==null){
        return head;
        }
       ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode tmp=pre;
        while (tmp.next!=null&&tmp.next.next!=null){
            ListNode start=tmp.next;
            ListNode end=tmp.next.next;
            tmp.next=end;
            start.next=end.next;
            end.next=start;
            tmp=start;
        }
        return pre.next;
}
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

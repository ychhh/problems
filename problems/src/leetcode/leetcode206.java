package leetcode;
//反转一个单链表。
public class leetcode206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode now=head;
        while (now!=null){
            ListNode nextTemp = now.next;
            now.next = prev;
            prev = now;
            now = nextTemp;
        }
        return prev;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

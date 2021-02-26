package leetcode;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

//反转一个单链表。
public class leetcode206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode now=head;
        while (now!=null){
            ListNode t=now.next;
            now.next=prev;
            prev=now;
            now=t;
        }

        return prev;
    }
//    public ListNode reverseList(ListNode head) {
//        //递归
//        //对于反转链表来说第一步 如果为null或者只有一个节点返回原始链表
//        if (head==null||head.next==null)
//            return head;
//        //递归调用
//        ListNode newList=reverseList(head.next);
//        //新建一个节点t保存head.next
//        ListNode t=head.next;
//        //t-》指向head
//        t.next=head;
//        //head指向null
//        head.next=null;
//        return newList;
//
//    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

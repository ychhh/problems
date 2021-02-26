package jz;

import java.util.List;

public class JZ24
{
//    public ListNode reverseList(ListNode head) {
//        if (head==null){
//            return head;
//        }
//        ListNode pre=null;
//        ListNode curr=head;
//        while (curr!=null){
//            ListNode node=curr.next;
//            curr.next=pre;
//            pre=curr;
//            curr=node;
//
//        }
//        return curr;
//    }
public ListNode reverseList(ListNode head) {
    if (head==null||head.next==null){
        return head;
    }
    ListNode currNode=head;
    ListNode temp=currNode.next;
    ListNode preNode=null;
    while (currNode!=null){
        temp=currNode.next;
        currNode.next=preNode;
        preNode=currNode;
        currNode=temp;
    }

    return preNode;
}

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

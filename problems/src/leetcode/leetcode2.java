package leetcode;
//给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，
// 并且它们的每个节点只能存储 一位 数字。
//如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
//输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807

import java.util.List;

public class leetcode2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode=new ListNode(0);
        ListNode pre=listNode;
        int jinwei=0;
        while (l1!=null||l2!=null){
            int x=l1==null?0:l1.val;
            int y=l2==null?0:l2.val;
            int sum=x+y+jinwei;
            System.out.println(sum%10);
            jinwei=sum>9?1:0;
            listNode.next=new ListNode(sum%10);
            listNode=listNode.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if (jinwei>=1){

            listNode.next=new ListNode(1);
        }
        return pre.next;
    }
    public static void main(String[] args) {
        ListNode node=new ListNode(2);
        node.next=new ListNode(4);
        node.next.next=new ListNode(3);
        ListNode node1=new ListNode(5);
        node1.next=new ListNode(6);
        node1.next.next=new ListNode(4);
        addTwoNumbers(node,node1);

    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

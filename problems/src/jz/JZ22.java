package jz;
//输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，
// 本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，
// 从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。



public class JZ22 {
    public ListNode getKthFromEnd(ListNode head, int k) throws Exception {
        if(head == null || k ==0 ){
            return null;
        }
        ListNode node=head;
        ListNode node2=head;
        for (int i=0;i<k;i++){
            if (node==null){
                return null;
            }
            node=node.next;
        }
        while (node!=null){
            node2=node2.next;
            node=node.next;
        }
        return node2;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

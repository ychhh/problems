package leetcode;
//给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一
// 个整数数字的二进制表示形式。
//请你返回该链表所表示数字的 十进制值 。

import java.util.List;

public class leetcode1290 {
    //左移方法
    public static int getDecimalValue(ListNode head) {
        int value=0;
        while (head!=null){
            value <<= 1;
            value=value+head.val;
            head=head.next;
        }
        return value;
    }
    //通过包装器类的valueof方法
//    public static int getDecimalValue(ListNode head) {
//        String x="";
//        StringBuilder str=new StringBuilder();
//        int value=0;
//        while (head!=null){
//            str.append(head.val);
//            head=head.next;
//        }
//        return Integer.valueOf(str.toString(),2);
//    }

    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        node.next=new ListNode(0);
        node.next.next=new ListNode(1);
        System.out.println(getDecimalValue(node));

    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

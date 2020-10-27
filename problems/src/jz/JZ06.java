package jz;

import leetcode.leetcode1290;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;

//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
public class JZ06 {
    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> arr=new ArrayList();
        while (head!=null){
            arr.add(0,head.val);
            head=head.next;
        }
        int[] list=new int[arr.size()];
        for (int i=0;i<arr.size();i++){
            list[i]=arr.get(i);
        }
        return list;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

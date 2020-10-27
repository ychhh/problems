package leetcode;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
public class leetcode82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node=head;
        ListNode node1=new ListNode(0);
        ListNode p=node1;
        ArrayList<Integer> list=new ArrayList();
        HashMap<Integer,Integer> map=new HashMap();
        while (node!=null){
            if (map.containsKey(node.val)){
                map.put(node.val,map.get(head.val)+1);
            }else {
                map.put(node.val,1);
            }
            node=node.next;
        }
        for(Integer k : map.keySet()) {

            if(map.get(k)==1) {
                System.out.println(k);
                list.add(k);
            }
        }
        Collections.sort(list);

        for(Integer i : list) {
            ListNode tmp = new ListNode(i);
            p.next = tmp;
            p = p.next;
        }

        return node1;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

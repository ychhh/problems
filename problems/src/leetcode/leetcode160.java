package leetcode;

import java.util.HashSet;
import java.util.List;

public class leetcode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hashSet=new HashSet<>();
        ListNode a=headA;
        ListNode b=headB;
        while (a!=null){
            hashSet.add(a);
            a=a.next;

        }
        while (b!=null){
            if (hashSet.contains(b)){
                return b;
            }
            b=b.next;
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

package leetcode;

import java.util.HashSet;

public class leetcode142 {
//    public ListNode detectCycle(ListNode head) {
//        ListNode fast=head;
//        ListNode slow=head;
//        while (fast!=null&&fast.next!=null){
//            fast=fast.next.next;
//            slow=slow.next;
//            if (slow==fast){
//                ListNode ptr = head;
//                while (ptr != slow) {
//                    ptr = ptr.next;
//                    slow = slow.next;
//                }
//                return ptr;
//            }
//        }
//        return null;
//    }
public ListNode detectCycle(ListNode head) {
    ListNode node=head;
    HashSet<ListNode> set=new HashSet<>();
    while(node!=null){
        if (set.contains(node)){
            return node;
        }else {
            set.add(node);
        }
        node=node.next;
    }
    return null;
}

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

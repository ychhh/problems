package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class leetcode25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ArrayDeque<ListNode> stack=new ArrayDeque<>();
        ListNode pre=new ListNode(0);
        ListNode p=pre;
        while(true){
            int count=0;
            ListNode temp=head;
            while (temp!=null&&count<k){
                stack.add(temp);
                temp=temp.next;
                count++;
            }
            if (count!=k){
                p.next=head;
                break;
            }
            while (!stack.isEmpty()){
                p.next = stack.pollLast();
                p = p.next;
            }
            p.next = temp;
            head = temp;
        }
        return pre.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

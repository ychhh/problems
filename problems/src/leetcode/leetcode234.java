package leetcode;

import java.util.Stack;

public class leetcode234 {
    public static boolean isPalindrome(ListNode head) {
        int length=0;
        ListNode node=head;
        ListNode pre=head;
        Stack<ListNode> stack=new Stack<>();
        ListNode curr=head;
        while (node!=null){
            length++;
            node=node.next;
        }
        System.out.println(length);
        for (int i=0;i<length/2;i++){
            pre=pre.next;
        }
        while (pre!=null){
            stack.push(pre);
            pre=pre.next;
        }
        while (!stack.isEmpty()){
            if (stack.pop().val!=curr.val){
                return false;
            }
            curr=curr.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node=new ListNode(0);
        node.next=new ListNode(0);
        System.out.println(isPalindrome(node));
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class leetcode155 {
    /** initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> helper;
    public leetcode155() {
        this.stack=new Stack<>();
        this.helper=new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (helper.isEmpty()||helper.peek()>=x){
            helper.push(x);
        }else {
            helper.push(helper.peek());
        }

    }

    public void pop() {
        int x=stack.pop();
//        if (helper.isEmpty()||helper.peek()==x){
            helper.pop();
//        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return helper.peek();
    }

    public static void main(String[] args) {
        leetcode155 leetcode155=new leetcode155();
        leetcode155.getMin();
    }
}

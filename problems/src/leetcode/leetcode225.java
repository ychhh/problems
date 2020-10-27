package leetcode;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import javax.print.DocFlavor;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

//用队列实现栈
public class leetcode225 {
    Queue<Integer> queue1 ;
    Queue<Integer> queue2 ;

    public leetcode225() {
        queue1=new ArrayDeque<>();
        queue2=new ArrayDeque<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue1.add(x);
        while (!queue2.isEmpty()){
            queue1.add(queue2.remove());
        }
        Queue<Integer> t=new ArrayDeque<>();
        t=queue1;
        queue1=queue2;
        queue2=t;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue2.remove();
    }

    /** Get the top element. */
    public int top() {
        return queue2.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(queue1.isEmpty()&&queue2.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

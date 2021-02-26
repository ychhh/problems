package leetcode;

import javafx.scene.layout.Priority;

import java.util.PriorityQueue;

public class leetcode703 {
    private PriorityQueue<Integer> priorityQueue;
    private int limit;
    public leetcode703(int k, int[] nums) {
        limit = k;
        priorityQueue=new PriorityQueue(k);
        for (int num:nums){
            add(num);
        }
    }

    public int add(int val) {
        if (priorityQueue.size()<limit){
            priorityQueue.add(val);
        }else if (val > priorityQueue.peek()){
            priorityQueue.poll();
            priorityQueue.add(val);
        }
        return priorityQueue.peek();
    }
}

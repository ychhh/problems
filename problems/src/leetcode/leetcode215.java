package leetcode;

import java.util.PriorityQueue;

public class leetcode215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(nums[i]);
        }
        for (int i = 0; i < nums.length - k; i++) {
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
    public void sort(int[] arr,int low,int high){
//        int i,j,temp,t;
//        if (low>high){
//            return;
//        }
//        i=low;
//        j=high;
//        temp=arr[low];
//        while (i<j){
//            while (temp<=arr[j]&&i<j){
//                j--;
//            }
//            while (temp>=arr[i]&&i<j){
//                i++;
//            }
//            if (i<j){
//                t=arr[i];
//                arr[i]=arr[j];
//                arr[j]=t;
//            }
//        }
//        arr[low]=arr[i];
//        arr[i]=temp;
//        sort(arr,low,i-1);
//        sort(arr,i+1,high);

    }

}

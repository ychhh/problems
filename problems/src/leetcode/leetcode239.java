package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class leetcode239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans=new int[nums.length-k+1];
        int x=0;
        int y;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        for (int j=k;j<nums.length;j++){
            ans[x]=pq.peek();
            x++;
            pq.remove(nums[j-k]);
            pq.add(nums[j]);
        }
        ans[x]=pq.peek();
        return ans;
    }

    public static void main(String[] args) {
       int[] nums  ={1,3,-1,-3,5,3,6,7};
       int k=3;
       int[] ans=maxSlidingWindow(nums,k);
        System.out.println(ans);
    }
}

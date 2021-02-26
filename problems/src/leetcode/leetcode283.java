package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode283 {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                count++;
                continue;
            }
            list.add(nums[i]);
        }
        for (int k=0;k<count;k++){
            list.add(0);
        }
        for (int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
    }
}

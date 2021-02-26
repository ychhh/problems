package leetcode;

import java.util.HashMap;

public class leetcode169 {
    public int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        HashMap<Integer,Integer> map=new HashMap<>();

        int num=0;
        for (int i=0;i<nums.length;i++){
            if (map.get(nums[i])!=null){
                map.put(nums[i],map.get(nums[i])+1);
                if (map.get(nums[i])>nums.length/2){
                    num=nums[i];
                }
            }else {
                map.put(nums[i],1);
            }
        }
        return num;
    }
}

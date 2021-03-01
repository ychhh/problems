package gaopin;

import java.util.HashMap;

public class twoSum {

    public int[] twoSum (int[] numbers, int target) {
        // write code here
        int[] nums = new int[2];
        HashMap<Integer,Integer> map=new HashMap();
        for (int i=0;i<numbers.length;i++){
            if (map.containsKey(target-numbers[i])){
                return new int[]{map.get(target-numbers[i]),i+1};
            }else {
                map.put(numbers[i],i+1);
            }
        }
        return nums;
    }
}

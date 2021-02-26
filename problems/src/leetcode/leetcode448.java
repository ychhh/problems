package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leetcode448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet hashSet=new HashSet();
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            hashSet.add(nums[i]);
        }
        for (int i=1;i<nums.length+1;i++){
            if (!hashSet.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}

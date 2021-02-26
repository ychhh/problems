package leetcode;

import java.util.ArrayList;
import java.util.List;

public class leetcode78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num:nums){
            List<List<Integer>> newresult=new ArrayList<>();
            for (List<Integer> list:result){
                List<Integer> list1=new ArrayList<>(list);
                list1.add(num);
                newresult.add(list1);
            }
            result.addAll(newresult);
        }
        return result;
    }
}

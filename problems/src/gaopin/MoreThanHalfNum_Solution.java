package gaopin;

import java.util.HashMap;

public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<array.length;i++){
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }
        }
        for (int j=0;j<array.length;j++){
            if (map.get(array[j])>array.length/2){
                return array[j];
            }
        }
        return -1;
    }
}

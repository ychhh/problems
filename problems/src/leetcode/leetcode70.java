package leetcode;

import java.util.HashMap;

public class leetcode70 {

    //存储式递归
    HashMap<Integer,Integer> hashMap=new HashMap();
    public int climbStairs(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        int x;
        int y;
        if (hashMap.containsKey(n-1)){
            x=hashMap.get(n-1);
        }else {
            x=climbStairs(n-1);
            hashMap.put(n-1,x);
        }
        if (hashMap.containsKey(n-2)){
            y=hashMap.get(n-2);
        }else {
            y=climbStairs(n-2);
            hashMap.put(n-2,y);
        }
        return x+y;
    }
}

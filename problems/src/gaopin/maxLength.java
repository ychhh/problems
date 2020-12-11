package gaopin;

import java.util.HashMap;
import java.util.HashSet;

//    给定一个数组arr，返回arr的最长无的重复子串的长度(无重复指的是所有数字都不相同)。
public class maxLength {
    public static int maxLength (int[] arr) {
        // write code here
        HashSet map=new HashSet();
        int len=0;
        int max=0;
        for (int i=0;i<arr.length;i++){
            if (!map.contains(arr[i])){
                map.add(arr[i]);
                len++;
            }else {
                max=Math.max(len,max);
                map.clear();
                len=1;
            }
        }
        max=Math.max(len,max);
        return max;
    }

    public static void main(String[] args) {
        int arr[]={2,2,3,4,3};
        System.out.println(maxLength(arr));
    }
}

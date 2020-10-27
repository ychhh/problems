package leetcode;

import java.util.HashMap;

//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
public class leetcode3 {
    public static int lengthOfLongestSubstring(String s) {
        //"abcabcbb"
        if (s.length() == 0) return 0;
        HashMap<Character,Integer> map=new HashMap();
        int max=0;
        int left=0;
        for (int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                System.out.println(left+"："+(map.get(s.charAt(i))+1));
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }

    public static void main(String[] args) {
        int i=lengthOfLongestSubstring("abba");
        System.out.println(i);
    }
}

package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class leetcode242 {
    public boolean isAnagram(String s, String t) {
        //hash方式
        if (s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (!map.keySet().contains(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        for (int j=0;j<t.length();j++){
            if (map.get(t.charAt(j))==null||map.get(t.charAt(j))==0){
                return false;
            }else{
                map.put(t.charAt(j),map.get(t.charAt(j))-1);
            }

        }
        return true;
    }
}

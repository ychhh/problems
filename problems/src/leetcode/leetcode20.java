package leetcode;

import java.util.*;

public class leetcode20 {
    public boolean isValid(String s) {

        //巧妙作法
//        while(s.contains("[]")||s.contains("{}")||s.contains("()")){
//            if (s.contains("[]")){
//                s=s.replace("[]","");
//            }
//            if (s.contains("()")){
//                s=s.replace("()","");
//            }
//            if (s.contains("{}")){
//                s=s.replace("{}","");
//            }
//        }
//        return s.length()==0;

        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> map = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                if (stack.isEmpty()||stack.peek() != map.get(s.charAt(i))){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();


    }
}

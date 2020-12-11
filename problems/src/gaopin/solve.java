package gaopin;
//以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
public class solve {
    public static String solve (String s, String t) {
        if (s.length()<t.length()){
            String temp=s;
            s=t;
            t=temp;
        }
        System.out.println(s+":"+t);
        StringBuilder stringBuilder=new StringBuilder();
        int shortLength=t.length();
        int lonfLength=s.length();
        int carry=0;
        for (int i=0;i<shortLength;i++){
            int add=(s.charAt(lonfLength-i-1)-'0')+(t.charAt(shortLength-i-1)-'0')+carry;
            stringBuilder.append(add % 10);
            carry=add/10;
        }
        for (int j=shortLength;j<lonfLength;j++){
            int add=(s.charAt(lonfLength-j-1)-'0')+carry;
            stringBuilder.append(add % 10);
            carry=add/10;
        }
        if (carry>0){
            stringBuilder.append(carry);
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("34545","1"));
    }
}

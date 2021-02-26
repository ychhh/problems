package yuanma;

import jz.JZ06;

public class equal {


    public static void main(String[] args) {

        //Object的equals方法
        Object object=new Object();
        object.equals("1");
        /*
        return (this == obj);
         */
        //Integer的equals方法   基本类型包装器类都如此
        Integer i=new Integer(1);
        i.equals(2);
        /*
        instanceof 严格来说是Java中的一个双目运算符，用来测试一个对象是否为一个类的实例
        if (obj instanceof Integer) {
            return value == ((Integer)obj).intValue();
        }
        return false;
         */

        String string=new String("123");
        string.equals("123");
        /*
        public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
         */
    }
}

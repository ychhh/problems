package leetcode;

public class leetcode461 {
    public int hammingDistance(int x, int y) {
//        return Integer.bitCount(x^y);
        int num=x^y;
        int n=0;
        while (num!=0){
            if (num%2==1){
                n++;
            }
            num=num>>1;
        }
        return n;
    }
}

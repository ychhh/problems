package leetcode;

public class leetcode121 {
    public int maxProfit(int[] prices) {
        int max=0;
        for (int i=0;i<prices.length;i++){
            for (int j=i;j<prices.length;j++){
               max = Math.max(prices[j]-prices[i],max);
            }
        }
        return max;
    }
}

package leetcode;

public class leetcode1 {
    public int[] twoSum(int[] nums, int target) {
        int[] a={0,0};
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (target-nums[i]==nums[j]&&i!=j){
                    a[0]=i;
                    a[1]=j;
                    return a;
                }
            }
        }
        return a;
    }
}

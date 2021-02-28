package myproblems.sort;

//请实现有重复数字的升序数组的二分查找。
//输出在数组中第一个大于等于查找值的位置，
// 如果数组中不存在这样的数(指不存在大于等于查找值的数)，则输出数组长度加一。
public class BinSearch {
    public int upper_bound_ (int n, int v, int[] a) {
        int l,r,mid;
        l=0;
        r=n-1;
        if (v>a[n-1]){
            return n+1;
        }
        mid =(l + r)/2;
        // write code here
        while (l<r){
            if (a[mid]<v){
                l=mid+1;
            }
            if (a[mid]>=v){
                r=mid;
            }
            mid =(l + r)/2;
        }
        return mid+1;
    }
}

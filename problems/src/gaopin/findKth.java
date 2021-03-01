package gaopin;

public class findKth {
    public int findKth(int[] a, int n, int K) {
        // write code here
        sort(a,0,n-1);
        return a[K-1];
    }
    public void sort(int[] arr,int low ,int high){
        if (low>high){
            return;
        }
        int i,j,temp,t;
        i=low;
        j=high;
        temp=arr[low];
        while (i<j){
            while (temp<=arr[j]&&i<j){
                j--;
            }
            while (temp>=arr[i]&&i<j){
                i++;
            }
            if (i<j){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        arr[low]=arr[i];
        arr[i]=temp;
        sort(arr,low,i-1);
        sort(arr,i+1,high);
    }
}

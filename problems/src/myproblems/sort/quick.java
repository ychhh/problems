package myproblems.sort;

public class quick {
    public static void quickSort(int[] arr,int low,int high) {
        int i,j,temp,t;
        if (low>high){
            return;
        }
        temp=arr[low];
        i=low;
        j=high;
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
        quickSort(arr,low,i-1);
        quickSort(arr,i+1,high);
    }
    public static void main(String[] args){
        int[] arr = {2,4,5,8,9,1};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

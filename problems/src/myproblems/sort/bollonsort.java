package myproblems.sort;

public class bollonsort {
    public int[] MySort (int[] arr) {
        // write code here
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
              if (arr[j]>arr[j+1]){
                  int t=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=t;
              }
            }
        }
        return arr;
    }
}

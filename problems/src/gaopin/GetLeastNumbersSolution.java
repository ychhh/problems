package gaopin;

import java.util.ArrayList;

//输入n个整数，找出其中最小的K个数。
// 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
public class GetLeastNumbersSolution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        if (input.length==0||input.length<k)
            return list;
        for (int i=0;i<input.length-1;i++){
            for (int j=0;j<input.length-i-1;j++){
                if (input[j]>input[j+1]){
                    int t=input[j];
                    input[j]=input[j+1];
                    input[j+1]=t;
                }
            }
        }
        for (int y=0;y<k;y++){
            list.add(input[y]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={2,6,5,6,7,1};
//        GetLeastNumbers_Solution(arr,4);
        System.out.println(GetLeastNumbers_Solution(arr,4));
    }
}

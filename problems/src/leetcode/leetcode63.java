package leetcode;

public class leetcode63 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] arr=new int[m][n];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (obstacleGrid[i][j]==1){
                    arr[i][j]=0;
                }
                else if(i==0&&j==0){
                    arr[0][0]=1;
                }
                else if (i==0){
                    arr[i][j]=arr[i][j-1];
                }
                else if (j==0){
                    arr[i][j]=arr[i-1][j];
                }
                else{
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];
                }
            }
        }
        return arr[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] arr={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(arr));
    }
}

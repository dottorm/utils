public class Solution {
    
    static int solve(int arr[][], int len){
        int sum = -100000;
        int actualsum = 0;
        for (int i=0; i<arr.length-2; i++){
            for (int j=0; j<arr.length-2; j++){
                actualsum = arr[i][j]+arr[i][j+1]+arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                
                if(actualsum > sum){
                    sum = actualsum;
                }  
            }
        }
        return sum;
    }
}

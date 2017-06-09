public class ReverseArrayRecursive {
    
    public static void solve(int[] arr, int len){
        if(len < 0){
            return;
        }
        
        System.out.print(arr[len]+" ");
        solve(arr, len-1);
    }
}

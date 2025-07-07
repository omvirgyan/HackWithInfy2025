import java.util.Arrays;

public class fibByMemoization {
public int fib(int num, int[] dp){
    if(num==0||num==1) return num;
    if(dp[num]!=-1){
        return dp[num];
    }

    dp[num]=fib(num-1,dp)+fib(num-2,dp);
    return dp[num];
}
public static void main(String[] args) {
    fibByMemoization dp=new fibByMemoization();
    int n=10;
    int arr[]=new int[n+1];
    Arrays.fill(arr, -1);
    System.out.println(dp.fib(n,arr));
}
    
}
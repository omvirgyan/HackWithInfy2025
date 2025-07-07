public class problem4_CoinChange {
    public static int minCoin(int[] arr,int amount){
        int[] dp=new int[amount+1];
        
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=amount;j++){
                 if(arr[i]-j==0) dp[j]=1;
                 else{
                    
                 }
            }
        }

    } 
    public static void main(String[] args) {
        
    }
}

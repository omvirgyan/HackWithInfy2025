import java.util.Arrays;
public class Problem3_Minimum_NumberOfCoins {
     public static int minCoin(int[] arr, int amount){
       Arrays.sort(arr);
       int sum=0;
       int count=0;
        for(int i=arr.length-1;i>=0;i--){
             while (sum + arr[i] <= amount) {
                sum += arr[i];
                count++;
            }
            if (sum == amount) return count;

        }
        return count;
     }

    public static void main(String[] args) {
        int[] coin={1, 2, 5, 10, 20, 50, 100};
        System.out.println(minCoin(coin,5));
    }
}

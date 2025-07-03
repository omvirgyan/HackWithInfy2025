import java.util.Arrays;

public class Problem3_Buy_Two_Chocolates {
    public static int buyChoco(int[] prices, int money) {
         Arrays.sort(prices);
         int sum=prices[0];
         for(int i=1;i<prices.length;i++){
             if(sum+prices[i]<=money){
                return money -(sum+prices[i]);
             }
              else{
                sum=0;
                sum +=prices[i-1];
              }
         }
         return money;
    }
    public static void main(String[] args) {
        int[] prices = {1,2,2};
        int money=3;
        System.out.println(buyChoco(prices,money));

    }
}

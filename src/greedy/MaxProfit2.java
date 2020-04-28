package greedy;

public class MaxProfit2 {
    public static int maxProfit(int[] prices) {
        int sumProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i-1]) {
                sumProfit += (prices[i] - prices[i-1]);
            }
        }
        return sumProfit;
    }

    public static void main(String[] args) {
        int[] prices = {6,1,3,2,4,7};
        System.out.println(maxProfit(prices));
    }
}

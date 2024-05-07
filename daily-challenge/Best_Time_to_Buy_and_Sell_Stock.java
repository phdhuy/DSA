public class Best_Time_to_Buy_and_Sell_Stock {

    public static int maxProfit(int[] prices) {
        int res = 0;

        int minPrices = prices[0];

        for(int i = 1; i < prices.length; i++) {
            minPrices = Math.min(prices[i], minPrices);

            if(prices[i] >= minPrices) {
                int temp = prices[i] - minPrices;
                res = Math.max(res, temp);
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}

public class StockBuySell {

    public static int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return -1;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Update minimum buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate profit
            int profit = prices[i] - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        // If no profit possible
        if (maxProfit == 0) {
            return -1;
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {4,3,2,1};

        System.out.println(maxProfit(prices1)); // 5
        System.out.println(maxProfit(prices2)); // -1
    }
}

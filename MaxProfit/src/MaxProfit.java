import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];
        for (int j = 0; j < prices.length - 1; j++) {
            if (minPrice > prices[j]) {
                minPrice = prices[j];
            }
            if (profit < prices[j] - minPrice) {
                profit = prices[j] - minPrice;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 3, 4, 5, 6, 5};
        int[] prices1 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices1));
    }
}

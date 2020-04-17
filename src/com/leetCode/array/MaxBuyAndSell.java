package leetCode.array;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 * <p>
 * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 * <p>
 * Example 1:
 * <p>
 * Input: [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 */
public class MaxBuyAndSell {
    public static void main(String[] args) {
        int[] stocks = {7, 1, 5, 3, 6, 4};
        System.out.println(findMaxProfit(stocks));
    }

    public static int findMaxProfit(int[] stocks) {
        int result = 0;
        int buyValue = 0;
        for (int i = 0; i < stocks.length; i++) {
            buyValue = stocks[i];
            while (i + 1 <stocks.length&& stocks[i] < stocks[i + 1]) {
                i++;
            }
            if (stocks[i] > buyValue)
                result += stocks[i] - buyValue;
        }
        return result;
    }

    public static int findMaxProfitBetterTHanMe(int[] stocks) {
        int result = 0;
        for (int i = 1; i < stocks.length; i++) {
            if (stocks[i] > stocks[i-1])
                result += stocks[i] - stocks[i-1];
        }
        return result;
    }
}

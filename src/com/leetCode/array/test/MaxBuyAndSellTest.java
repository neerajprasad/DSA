package leetCode.array.test;

import leetCode.array.MaxBuyAndSell;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxBuyAndSellTest {

    @Test
    void HappyTest() {
        int[] stocks = {7, 1, 5, 3, 6, 4};
        assertEquals(MaxBuyAndSell.findMaxProfitBetterTHanMe(stocks),7);
    }

    @Test
    void happyTestMaxProfit() {
        int[] stocks = {1,2,3,4,5};
        assertEquals(MaxBuyAndSell.findMaxProfitBetterTHanMe(stocks),4);
    }

    @Test
    void happyTestNoProfit() {
        int[] stocks = {7,6,4,3,1};
        assertEquals(MaxBuyAndSell.findMaxProfitBetterTHanMe(stocks),0);
    }
}
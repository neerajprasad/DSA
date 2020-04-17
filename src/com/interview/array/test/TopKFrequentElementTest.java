package interview.array.test;

import interview.array.TopKFrequentElement;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementTest {

    @Test
    void topKFrequent() {
        assertEquals(TopKFrequentElement.topKFrequent(new int[]{1,1,1,1,1,2,2,2,3},2), Arrays.asList(1,2));
    }

    @Test
    void topKFrequentSingleValue() {
        assertEquals(TopKFrequentElement.topKFrequent(new int[]{1},1), Arrays.asList(1));
    }
    @Test
    void topKFrequentNotSorted() {
        assertEquals(TopKFrequentElement.topKFrequent(new int[]{3,0,1,0},1), Arrays.asList(0));
    }
    @Test
    void topKFrequentNotSortedNegativeNumber() {
        assertEquals(TopKFrequentElement.topKFrequentHeap(new int[]{4,1,-1,2,-1,2,3},2), Arrays.asList(-1,1));
    }
}
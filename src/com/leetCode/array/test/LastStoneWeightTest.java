package leetCode.array.test;

import leetCode.array.LastStoneWeight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {

    @Test
    void getLastWeight() {
        assertEquals(LastStoneWeight.getLastWeight(new int[]{2,2}),0);
    }
    @Test
    void getLastWeightNonRepeated(){
        int[] arr = {2,7,4,1,8,1};
        assertEquals(LastStoneWeight.getLastWeight(arr),1);
    }
}
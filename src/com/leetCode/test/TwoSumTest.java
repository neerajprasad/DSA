package leetCode.test;

import leetCode.array.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    public void findPath(){
        int[] value={2, 7, 11, 15};
        int[] target = {0, 1};
        assertEquals(new TwoSum().twoSum(value,9),target);
    }
}
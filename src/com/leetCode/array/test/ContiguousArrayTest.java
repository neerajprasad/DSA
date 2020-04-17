package leetCode.array.test;

import leetCode.array.ContiguousArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContiguousArrayTest {

    @Test
    void getLongestContiguousCount() {
        int[] arr ={0,1,1};
        assertEquals(ContiguousArray.getLongestContiguousCount(arr),2);
    }

    @Test
    void getLongestContiguous2() {
        int[] arr ={0,1};
        assertEquals(ContiguousArray.getLongestContiguousCount(arr),2);
    }
    @Test
    void getLongestContiguous3() {
        int[] arr ={1, 0, 0, 1, 0, 1, 1};
        assertEquals(ContiguousArray.getLongestContiguousCount(arr),6);
    }
}
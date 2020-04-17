package leetCode.array.test;

import leetCode.array.Arrange2LargestNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Arrange2LargestNumberTest {
    private Arrange2LargestNumber arrange2LargestNumber;
    @BeforeEach
    void setUp() {
        arrange2LargestNumber=new Arrange2LargestNumber();
    }

    @Test
    void largestNumber() {
        assertEquals(arrange2LargestNumber.largestNumber(Arrays.asList(3, 30, 34, 5, 9)),"9534330");
    }
    @Test
    void largestNumberWithRepeatedZero() {
        assertEquals(arrange2LargestNumber.largestNumber(Arrays.asList(0,0,0,0)),"0");
    }
    @Test
    void largestNumberWithRepeatedNonZero() {
        assertEquals(arrange2LargestNumber.largestNumber(Arrays.asList(101234567,1012356,10,10)),"10123561012345671010");
    }
}
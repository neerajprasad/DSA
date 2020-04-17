package interview.walmart.test;

import interview.walmart.LongestConsecutiveSubsequence;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSubsequenceTest {

    @Test
    void find() {
        assertEquals(LongestConsecutiveSubsequence.find(Arrays.asList(2, 6 ,1 ,9 ,4 ,5, 3)),6);
    }
}
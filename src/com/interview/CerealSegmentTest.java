package interview;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CerealSegmentTest {
    @Test
    void test1() {
        assertEquals(CerealSegment.segment(3, Arrays.asList(2, 5, 4, 6, 8)), 4);
    }

    @Test
    void test2() {
        assertEquals(CerealSegment.segment(1, Arrays.asList(1,2,3,1,2)), 3);
    }
}
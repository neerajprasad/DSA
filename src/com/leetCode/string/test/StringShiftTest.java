package leetCode.string.test;

import leetCode.string.StringShift;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringShiftTest {

    @Test
    void stringShift() {
        int[][] shift ={{0,1},{1,2}};
        assertEquals(StringShift.stringShift("abc",shift),"cab");
    }
    @Test
    void stringShift1() {
        int[][] shift ={{0,7},{1,7},{1,0},{1,3},{0,3},{0,6},{1,2}};
        assertEquals(StringShift.stringShift("wpdhhcj",shift),"hcjwpdh");
    }
}
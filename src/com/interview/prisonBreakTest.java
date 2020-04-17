package interview;

import interview.array.MaxAbsDifference;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class prisonBreakTest {
    @Test
    void test1(){

        assertEquals(PrisonBreak.prison(3,2,Arrays.asList(1,2,3),Arrays.asList(1,2)),12);
    }
}
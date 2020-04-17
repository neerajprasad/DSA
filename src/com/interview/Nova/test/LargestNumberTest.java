package interview.Nova.test;

import interview.Nova.LargestNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {
    @Test
    void pascalValue(){

        assertEquals(LargestNumber.Solve(3,2,9),8);
    }
    @Test
    void Testfail(){

        assertEquals(LargestNumber.Solve(1,2,4),-1);
    }
}
package interview.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAbsDifferenceTest {
    List<Integer> A;

    @Test
    void test1(){
        A= Arrays.asList(1,3,-1 );
        assertEquals(MaxAbsDifference.maxArr(A), 5);
    }
    @Test
    void test2(){
        A= Arrays.asList(2,2,2 );
        assertEquals(MaxAbsDifference.maxArr(A), 2);
    }
    @Test
    void test3(){
        A= Arrays.asList(81, 73, 53, 64, 90, 23, 66, 12, 66, 94  );
        assertEquals(MaxAbsDifference.maxArr(A), 84);
    }
}
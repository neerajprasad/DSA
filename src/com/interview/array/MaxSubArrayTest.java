package interview.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {
    List<Integer> A;
    @Test
    void test1(){
        A= Arrays.asList(1, 2, 5, -7, 2, 3);
        assertEquals(MaxSubArray.maxset(A),Arrays.asList(1,2,5));
    }
    @Test
    void test2(){
        A = Arrays.asList(1, 2, 5, -7, 2, 3,8);
        assertEquals(MaxSubArray.maxset(A), Arrays.asList(2,3,8));
    }
    @Test
    void test3(){
        A= Arrays.asList(2,2,2,2,2 );
        assertEquals(MaxSubArray.maxset(A), Arrays.asList(2,2,2,2,2));
    }
    @Test
    void test4(){
        A= Arrays.asList( 0, 0, -1, 0 );
        assertEquals(MaxSubArray.maxset(A), Arrays.asList(0,0));
    }
}
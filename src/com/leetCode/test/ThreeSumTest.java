package leetCode.test;

import leetCode.array.ThreeSum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    public void findPath(){
    int[] values={-1, 2, -1, 0,1, -4};
        assertEquals(ThreeSum.threeSum(values), Arrays.asList(Arrays.asList(-1,-1,2),Arrays.asList(-1,0,1)));
    }

    @Test
    public void failCase(){
        int[] values={};
        assertEquals(ThreeSum.threeSum(values), Arrays.asList());
    }
    @Test
    public void failCase1(){
        int[] values={-2,0,1,1,2};
//        [[-2,0,2],[-2,1,1]]
        assertEquals(ThreeSum.threeSum(values), Arrays.asList(Arrays.asList(-2,0,2),Arrays.asList(-2,1,1)));
    }

}
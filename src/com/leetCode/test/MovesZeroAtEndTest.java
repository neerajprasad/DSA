package leetCode.test;

import leetCode.array.MovesZeroAtEnd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovesZeroAtEndTest {

    @Test
    void moveZeroesTest() {
        int[] nums=new int[]{0,1,0,3,12};
        MovesZeroAtEnd.moveZeroes(nums);
        assertArrayEquals(nums,new int[]{1,3,12,0,0});
    }
    @Test
    void moveZeroesWithSingleNonZeroTest() {
        int[] nums=new int[]{0,0,0,0,12};
        MovesZeroAtEnd.moveZeroes(nums);
        assertArrayEquals(nums,new int[]{12,0,0,0,0});
    }
    @Test
    void moveZeroesWitheNonZeroTest() {
        int[] nums=new int[]{0,0,0,0};
        MovesZeroAtEnd.moveZeroes(nums);
        assertArrayEquals(nums,new int[]{0,0,0,0});
    }
    @Test
    void moveZeroesWitheAllNonZeroTest() {
        int[] nums=new int[]{10,10,01,110};
        MovesZeroAtEnd.moveZeroes(nums);
        assertArrayEquals(nums,new int[]{10,10,01,110});
    }
    @Test
    void moveZeroesWitheAllZeroTest() {
        int[] nums=new int[]{4,2,4,0,0,3,0,5,1,0};
        MovesZeroAtEnd.moveZeroes(nums);
        assertArrayEquals(nums,new int[]{4,2,4,3,5,1,0,0,0,0});
    }

}
package interview.dp.test;

import interview.dp.Stairs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StairsTest {

    @Test
    void test1_with_single_space(){
        String str= "Neeraj is good boy";
        Assertions.assertEquals(Stairs.climbStairs(4),5);
    }

}
package interview.string;

import interview.array.MaxSubArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    void test1_with_single_space(){
        String str= "Neeraj is good boy";
        assertEquals(ReverseString.solve(str),"boy good is Neeraj");
    }

    @Test
    void test1_with_multiple_space(){
        String str= "Neeraj   is good boy";
        assertEquals(ReverseString.solve(str),"boy good is Neeraj");
    }
}
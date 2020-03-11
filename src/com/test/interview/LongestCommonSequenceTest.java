package test.interview;

import interview.dp.LongestCommonSequence;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSequenceTest {
    LongestCommonSequence longestCommonSequence= new LongestCommonSequence();
    ArrayList<Integer> a = new ArrayList<Integer>();
    int[] values = {1, 11, 2, 10, 4, 5, 2, 1};
    @BeforeEach
    void setUp() {

        a.add(1);
        a.add(11);
        a.add(2);
        a.add(10);
        a.add(4);
        a.add(5);
        a.add(2);
        a.add(1);
//        a.add(1);
//        a.add(9);
//        a.add(5);
//        a.add(13);
//        a.add(3);
//        a.add(11);
//        a.add(7);
//        a.add(15);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void lisCount() {
        assertEquals(6,longestCommonSequence.lisCount(a));
    }
}
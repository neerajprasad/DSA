package interview.array.test;

import interview.array.NobleInteger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NobleIntegerTest {
    Integer[] array;
    NobleInteger nobleInteger;
    @BeforeEach
    void setUp() {

        nobleInteger= new NobleInteger();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void nobelValue() {
        array = new Integer[]{-1,-3,-4,-5,-7,0};
        assertEquals(nobleInteger.nobelValue(array),0);
    }
    @Test
    void nobelValue1() {
        array = new Integer[]{-1,-3,-4,-5,-7};
        assertEquals(nobleInteger.nobelValue(array),-1);
    }
    @Test
    void nobelValue2() {
        array = new Integer[]{6,7,5};
        assertEquals(nobleInteger.nobelValue(array),-1);
    }
    @Test
    void nobelValue3() {
        List<Integer> A = Arrays.asList(5,6,2);
        assertEquals(nobleInteger.nobelValue(A),2);
    }
}
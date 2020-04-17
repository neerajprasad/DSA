package interview.hashing.test;

import interview.hashing.ContiniousSequenceSumZero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ContiniousSequenceSumZeroTest {
    ContiniousSequenceSumZero continiousSequenceSumZero;

    @BeforeEach
    void before(){
        continiousSequenceSumZero = new ContiniousSequenceSumZero();
    }
    @Test
    void TestHappyFlow(){
        assertEquals(continiousSequenceSumZero.sumZeroLength(Arrays.asList(15,-2,2,-8,1,7,10,23)),5);
    }

    @Test
    void TestFlow(){
        assertEquals(continiousSequenceSumZero.isSumZero(Arrays.asList(15,-2,2)),Arrays.asList(-2,2));
    }
    @Test
    void TestFaiFlow(){
        assertEquals(continiousSequenceSumZero.isSumZero(Arrays.asList(1, 2, -3, 3 )),Arrays.asList(1,2,-3));
    }
    @Test
    void TestFailFlow(){
        assertEquals(continiousSequenceSumZero.isSumZero(Arrays.asList(1, 2, -2, 4, -4 )),Arrays.asList(2, -2, 4, -4 ));
    }
    @Test
    void TestAlternate(){
        assertEquals(continiousSequenceSumZero.isSumZero(Arrays.asList(-1, 1, 1, -1, -1, 1, 1, -1)),Arrays.asList(-1, 1, 1, -1, -1, 1, 1, -1));
    }
    @Test
    void TestAlternateLong(){
        assertEquals(continiousSequenceSumZero.lszero(Arrays.asList(10, -3, -9, -10, 9, -26, 7, -2, -20, -19, -9, 7, 13, -5, -8, -24, -11, 28, 28, 24)),Arrays.asList(-19 ,-9, 7, 13, -5, -8, -24, -11, 28, 28));
    }
}
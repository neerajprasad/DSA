package leetCode.string.test;

import leetCode.string.BackspaceStringCompare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStringCompareTest {

    @Test
    void removeBackspace() {
        assertEquals(BackspaceStringCompare.removeBackspace("ab##"),"");
    }
    @Test
    void removeBackspace1() {
        assertEquals(BackspaceStringCompare.removeBackspace("a#b#"),"");
    }
    @Test
    void removeBackspace2() {
        assertEquals(BackspaceStringCompare.removeBackspace("#a#c"),"c");
    }

    @Test
    void removeBackspace3() {
        assertEquals(BackspaceStringCompare.removeBackspace("ab#c"),"ac");
    }
}
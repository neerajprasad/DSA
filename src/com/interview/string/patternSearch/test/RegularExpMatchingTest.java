package interview.string.patternSearch.test;

import interview.string.patternSearch.RegularExpMatching;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegularExpMatchingTest {


    @Test
    void isMatchForPatterStar() {
        assertEquals(RegularExpMatching.isMatch("aa", "*"), true);
    }

    @Test
    void isMatchForPatterPlus() {
        assertEquals(RegularExpMatching.isMatch("aa", "a+"), true);
    }

    @Test
    void isMatch() {
        assertEquals(RegularExpMatching.isMatch("aa", "aa"), true);
    }
    @Test
    void isNotMatch() {
        assertEquals(RegularExpMatching.isMatch("aab", "aa"), false);
    }
    @Test
    void isMatchForStarAndPlus() {
        assertEquals(RegularExpMatching.isMatch("aa", "+*"), false);
    }

    @Test
    void isMatchForString() {
        assertEquals(RegularExpMatching.isMatch("mississippi", "mis*is*p*."), false);
    }
}
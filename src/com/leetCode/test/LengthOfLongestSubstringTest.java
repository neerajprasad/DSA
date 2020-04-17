package leetCode.test;

import leetCode.string.LengthOfLongestSubstring;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubstringTest {
private LengthOfLongestSubstring lengthOfLongestSubstring;
    @BeforeEach
    void setUp() {
        lengthOfLongestSubstring=new LengthOfLongestSubstring();
    }

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"),3);
    }
    @Test
    void lengthOfLongestSubstringSingleRepeatedChar() {
        assertEquals(lengthOfLongestSubstring.lengthOfLongestSubstring("aaaaaaa"),1);
    }
    @Test
    void lengthOfLongestSubstringSingleRepeatedCharAndNotRepeatedChar() {
        assertEquals(lengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"),3);
    }
}
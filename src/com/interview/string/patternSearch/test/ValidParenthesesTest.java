package interview.string.patternSearch.test;

import interview.string.patternSearch.ValidParentheses;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValidForFalse() {
        assertEquals(ValidParentheses.isValid("{{}}]"),false);
    }
    @Test
    void isValid() {
        assertEquals(ValidParentheses.isValid("{[]}"),true);
    }

    @Test
    void isValid1() {
        assertEquals(ValidParentheses.isValid("([)]"),true);
    }
}
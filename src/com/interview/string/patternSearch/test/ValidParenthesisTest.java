package interview.string.patternSearch.test;

import interview.string.patternSearch.ValidParenthesis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesisTest {

    @Test
    void isValid() {
        String input="(*))";
        assertEquals(ValidParenthesis.isValid(input),true);
    }

    @Test
    void isValid1() {
        String input="(*()";
        assertEquals(ValidParenthesis.isValid(input),true);
    }
    @Test
    void isValid11() {
        String input="(*(()";
        assertEquals(ValidParenthesis.isValid(input),false);
    }

    @Test
    void isValid2() {
        String input="()";
        assertEquals(ValidParenthesis.isValid(input),true);
    }
}
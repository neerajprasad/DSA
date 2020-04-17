package leetCode.string.test;

import leetCode.string.ZigZagConversionOfString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConversionOfStringTest {
    private ZigZagConversionOfString zigZagConversionOfString;
    @BeforeEach
    void setUp() {
        zigZagConversionOfString = new ZigZagConversionOfString();
    }

    @Test
    void convertForLenght3() {
        assertEquals(zigZagConversionOfString.convert("PAYPALISHIRING",3),"PAHNAPLSIIGYIR");
    }

    @Test
    void convertForLenght4() {
        assertEquals(zigZagConversionOfString.convert("PAYPALISHIRING",4),"PINALSIGYAHRPI");
    }
}
package leetCode.array.test;

import leetCode.array.CountingElements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingElementsTest {

    @Test
    void countElements() {
        int[] arr={1,1,3,3,5,5,7,7};
        assertEquals(CountingElements.countElements(arr),0);
    }

    @Test
    void countElementsUnsort() {
        int[] arr={1,3,2,3,5,0};
        assertEquals(CountingElements.countElements(arr),3);
    }

    @Test
    void countElementsUnsortRepeated() {
        int[] arr={1,1,2,2};
        assertEquals(CountingElements.countElements(arr),2);
    }
    @Test
    void countElementsLong() {
        int[] arr={14,24,111,119,60,111,278,169,106,281,173,198,88,171,142,31,201,198,147,76,100,231,249,52,204,199,285,253,253,45,125,264,139,26,150,150,227,207,197,297,18,174,194,179,1,131,1,97,44,10,73,36,248,10,36,230,10,213,121,296,196,224,5,96,82,63,4,213,68,199,208,191,129,292,160,110,216,30,9,279,129,118,210,248,164,65,227,221,73,127,206,143,270,276,179,49,127,230,222,134,1,275,213,111,222,70,218,50,200,163,95,238,269,215,283,282,146,172,115,166,258,230,227,55,65,147,106,19,32,197,50,138,54,297,14,84,93,279,112,242,85,217,87,276,282,207,68,277,299,219,115,263,244,77,148,23,4,199,296,22,0,271,49,177,214,65,156,8,116,45,32,56,66,283,187,97,65,0,193,147,182,108,27,291,131,58,90,286,12,37,179,33,99,14,113,130,3,53,115,196,141,225,284,139,263,256,147,263,287,241,293,65,247,188,76,202,53,291,82,267,220,299,103,121,127,227,290,192,152,101,199,268,84,192,214,86,295,204,113,90,95,8,287,276,220,246,45,1,188,89,108,90,94,217,294,29,40,254,157,147,117,243,41,89,286,97,110,145,84,234,38,286,19,295,163,128,183,227,231,243,202,71,179,209,152,125,8,292,172,247,84,265,128,185,211,162,247,271,133,55};
        assertEquals(CountingElements.countElements(arr),184);
    }

}
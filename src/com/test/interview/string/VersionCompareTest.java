package test.interview.string;

import org.junit.jupiter.api.Test;

import interview.string.ValidNumber;

import static org.junit.jupiter.api.Assertions.*;

class VersionCompareTest {
    @Test
    public void testValidNumber(){
        assertEquals(ValidNumber.validNumberUtil(".1"),1);
    }

}
package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0006-Z字形变换
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-02-05 23:34
 */
class No0006ZigzagConversionTest {
    void assertEquals(String s, int numRows, String excepted) {
        No0006ZigzagConversion zigzagConversion = new No0006ZigzagConversion();
        String actual = zigzagConversion.convert(s, numRows);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testConvert1() {
        this.assertEquals("LEETCODEISHIRING", 3, "LCIRETOESIIGEDHN");
    }

    @Test
    void testConvert2() {
        this.assertEquals("LEETCODEISHIRING", 4, "LDREOEIIECIHNTSG");
    }

    @Test
    void testConvert3() {
        this.assertEquals("", 3, "");
    }

    @Test
    void testConvert4() {
        this.assertEquals("LEETCODEISHIRING", 1, "LEETCODEISHIRING");
    }

    @Test
    void testConvert5() {
        this.assertEquals("A", 3, "A");
    }
}

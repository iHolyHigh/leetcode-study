package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0013-罗马数字转整数 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-08 22:55
 */
class No0013RomanToIntegerTest {
    void assertEquals(String s, int excepted) {
        No0013RomanToInteger romanToInteger = new No0013RomanToInteger();
        int actual = romanToInteger.romanToInt(s);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testRomanToInt1() {
        this.assertEquals("III", 3);
    }

    @Test
    void testRomanToInt2() {
        this.assertEquals("IV", 4);
    }

    @Test
    void testRomanToInt3() {
        this.assertEquals("IX", 9);
    }

    @Test
    void testRomanToInt4() {
        this.assertEquals("LVIII", 58);
    }

    @Test
    void testRomanToInt5() {
        this.assertEquals("MCMXCIV", 1994);
    }
}

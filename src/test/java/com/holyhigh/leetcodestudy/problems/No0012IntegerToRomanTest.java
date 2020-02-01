package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0012-整数转罗马数字
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-02-01 23:44
 */
class No0012IntegerToRomanTest {
    void assertEquals(int num, String excepted) {
        No0012IntegerToRoman integerToRoman = new No0012IntegerToRoman();
        String actual = integerToRoman.intToRoman(num);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testIntToRoman1() {
        this.assertEquals(3, "III");
    }

    @Test
    void testIntToRoman2() {
        this.assertEquals(4, "IV");
    }

    @Test
    void testIntToRoman3() {
        this.assertEquals(9, "IX");
    }

    @Test
    void testIntToRoman4() {
        this.assertEquals(58, "LVIII");
    }

    @Test
    void testIntToRoman5() {
        this.assertEquals(1994, "MCMXCIV");
    }
}

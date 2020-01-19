package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0066-加一 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-15 00:43
 */
class No0066PlusOneTest {
    void assertEquals(int[] digits, int[] excepted) {
        No0066PlusOne plusOne = new No0066PlusOne();
        int[] actual = plusOne.plusOne(digits);
        Assertions.assertArrayEquals(excepted, actual);
    }

    @Test
    void testPlusOne1() {
        int[] digits = {1, 2, 3};
        int[] excepted = {1, 2, 4};
        this.assertEquals(digits, excepted);
    }

    @Test
    void testPlusOne2() {
        int[] digits = {4, 3, 2, 1};
        int[] excepted = {4, 3, 2, 2};
        this.assertEquals(digits, excepted);
    }

    @Test
    void testPlusOne3() {
        int[] digits = {};
        int[] excepted = {1};
        this.assertEquals(digits, excepted);
    }

    @Test
    void testPlusOne4() {
        int[] digits = {1};
        int[] excepted = {2};
        this.assertEquals(digits, excepted);
    }

    @Test
    void testPlusOne5() {
        int[] digits = {9};
        int[] excepted = {1, 0};
        this.assertEquals(digits, excepted);
    }

    @Test
    void testPlusOne6() {
        int[] digits = {9, 9};
        int[] excepted = {1, 0, 0};
        this.assertEquals(digits, excepted);
    }

    @Test
    void testPlusOne7() {
        int[] digits = {9, 9, 9};
        int[] excepted = {1, 0, 0, 0};
        this.assertEquals(digits, excepted);
    }

    @Test
    void testPlusOne8() {
        int[] digits = {9, 8, 9};
        int[] excepted = {9, 9, 0};
        this.assertEquals(digits, excepted);
    }
}

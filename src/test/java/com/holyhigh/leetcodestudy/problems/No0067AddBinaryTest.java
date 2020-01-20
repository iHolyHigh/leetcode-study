package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0067-二进制求和 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-16 22:33
 */
class No0067AddBinaryTest {
    void assertEquals(String a, String b, String excepted) {
        No0067AddBinary addBinary = new No0067AddBinary();
        String actual = addBinary.addBinary(a, b);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testAddBinary1() {
        this.assertEquals("11", "1", "100");
    }

    @Test
    void testAddBinary2() {
        this.assertEquals("1010", "1011", "10101");
    }

    @Test
    void testAddBinary3() {
        this.assertEquals("0", "0", "0");
    }

    @Test
    void testAddBinary4() {
        this.assertEquals("0", "1", "1");
    }

    @Test
    void testAddBinary5() {
        this.assertEquals("1", "1", "10");
    }

    @Test
    void testAddBinary6() {
        this.assertEquals("10101", "11101011", "100000000");
    }

    @Test
    void testAddBinary7() {
        this.assertEquals("101111", "10", "110001");
    }
}

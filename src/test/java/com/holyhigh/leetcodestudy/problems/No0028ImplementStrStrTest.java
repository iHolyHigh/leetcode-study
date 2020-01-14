package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0028-实现strStr() 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-12 21:55
 */
class No0028ImplementStrStrTest {
    void assertEquals(String haystack, String needle, int excepted) {
        No0028ImplementStrStr implementStrStr = new No0028ImplementStrStr();
        int actual = implementStrStr.strStr(haystack, needle);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testStrStr1() {
        this.assertEquals("hello", "ll", 2);
    }

    @Test
    void testStrStr2() {
        this.assertEquals("aaaaa", "bba", -1);
    }

    @Test
    void testStrStr3() {
        this.assertEquals("a", "", 0);
    }

    @Test
    void testStrStr4() {
        this.assertEquals("", "a", -1);
    }

    @Test
    void testStrStr5() {
        this.assertEquals("", "", 0);
    }
}

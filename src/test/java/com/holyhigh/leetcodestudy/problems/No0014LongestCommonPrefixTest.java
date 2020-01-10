package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0014-最长公共前缀 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-10 21:43
 */
class No0014LongestCommonPrefixTest {
    void assertEquals(String[] strs, String excepted) {
        No0014LongestCommonPrefix longestCommonPrefix = new No0014LongestCommonPrefix();
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testLongestCommonPrefix1() {
        this.assertEquals(new String[] {"flower","flow","flight"}, "fl");
    }

    @Test
    void testLongestCommonPrefix2() {
        this.assertEquals(new String[] {"dog","racecar","car"}, "");
    }

    @Test
    void testLongestCommonPrefix3() {
        this.assertEquals(new String[] {"dog"}, "dog");
    }

    @Test
    void testLongestCommonPrefix4() {
        this.assertEquals(new String[] {"da", "db"}, "d");
    }

    @Test
    void testLongestCommonPrefix5() {
        this.assertEquals(new String[] {"a", "a"}, "a");
    }

    @Test
    void testLongestCommonPrefix6() {
        this.assertEquals(new String[] {"d", "a"}, "");
    }

    @Test
    void testLongestCommonPrefix7() {
        this.assertEquals(new String[] {"da", ""}, "");
    }

    @Test
    void testLongestCommonPrefix8() {
        this.assertEquals(new String[] {"d"}, "d");
    }

    @Test
    void testLongestCommonPrefix9() {
        this.assertEquals(new String[] {""}, "");
    }

    @Test
    void testLongestCommonPrefix10() {
        this.assertEquals(new String[] {}, "");
    }

    @Test
    void testLongestCommonPrefix11() {
        this.assertEquals(null, "");
    }
}

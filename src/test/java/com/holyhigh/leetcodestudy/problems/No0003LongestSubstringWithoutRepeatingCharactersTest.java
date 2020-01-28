package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0003-无重复字符的最长子串
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-28 23:45
 */
class No0003LongestSubstringWithoutRepeatingCharactersTest {
    void assertEquals(String s, int excepted) {
        No0003LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters =
                new No0003LongestSubstringWithoutRepeatingCharacters();
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testLengthOfLongestSubstring1() {
        this.assertEquals("abcabcbb", 3);
    }

    @Test
    void testLengthOfLongestSubstring2() {
        this.assertEquals("bbbbb", 1);
    }

    @Test
    void testLengthOfLongestSubstring3() {
        this.assertEquals("pwwkew", 3);
    }

    @Test
    void testLengthOfLongestSubstring4() {
        this.assertEquals("a", 1);
    }

    @Test
    void testLengthOfLongestSubstring5() {
        this.assertEquals("", 0);
    }
}

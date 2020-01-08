package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0009-回文数 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-08 00:16
 */
class No0009PalindromeNumberTest {
    void assertEquals(int x, boolean excepted) {
        No0009PalindromeNumber palindromeNumber = new No0009PalindromeNumber();
        boolean actual = palindromeNumber.isPalindrome(x);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testIsPalindrome1() {
        this.assertEquals(121, true);
    }

    @Test
    void testIsPalindrome2() {
        this.assertEquals(-121, false);
    }

    @Test
    void testIsPalindrome3() {
        this.assertEquals(10, false);
    }

    @Test
    void testIsPalindrome4() {
        this.assertEquals(1234554321, true);
    }

    @Test
    void testIsPalindrome5() {
        this.assertEquals(-1234554321, false);
    }

    @Test
    void testIsPalindrome6() {
        this.assertEquals(0, true);
    }

    /**
     * 输入-0，转换后理论上应该时0-，实际方法传递后x值已经变为0，所以还是当作0处理
     */
    @Test
    void testIsPalindrome7() {
        this.assertEquals(-0, true);
    }
}

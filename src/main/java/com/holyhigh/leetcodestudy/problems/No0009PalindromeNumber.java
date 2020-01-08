package com.holyhigh.leetcodestudy.problems;

/**
 * No0009-回文数
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-08 00:11
 */
class No0009PalindromeNumber {
    boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long result = 0;
        int copy = x;
        int len = Integer.toString(copy).length();
        for (int i = 0; i < len; i++, copy /= 10) {
            result = result * 10 + copy % 10;
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return false;
        }
        return (int) result == x;
    }
}

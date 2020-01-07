package com.holyhigh.leetcodestudy.problems;

/**
 * No0007-整数反转
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-07 23:39
 */
class No0007ReverseInteger {
    int reverse(int x) {
        long result = 0;
        int len = Integer.toString(x).length();
        boolean isNegative = x < 0;
        if (isNegative) {
            len -= 1;
        }
        for (int i = 0; i < len; i++) {
            int y = x % 10;
            result = result * 10 + y;
            x /= 10;
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) result;
    }
}

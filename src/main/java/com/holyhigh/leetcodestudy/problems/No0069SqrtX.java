package com.holyhigh.leetcodestudy.problems;

/**
 * No0069-x的平方根
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-16 22:55
 */
class No0069SqrtX {
    int mySqrt(int x) {
        for (int i = 0; i < x; i++) {
            // i * i <= x && (i + 1) * (i + 1) > x
            // (i + 1) * (i + 1)整型存在溢出问题，转换为如下判断即可
            if (i * i <= x && i * i > x - 2 * i - 1) {
                return i;
            }
        }
        return x;
    }

    int mySqrt1(int x) {
        return (int) Math.sqrt(x);
    }
}

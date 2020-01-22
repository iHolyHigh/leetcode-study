package com.holyhigh.leetcodestudy.problems;

/**
 * No0070-爬楼梯
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-15 23:23
 */
class No0070ClimbingStairs {
    /**
     * 动态规划
     * 1 2 3 5 8 13 ...
     */
    int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int p = 1, q = 2, temp;
        for (int i = 3; i < n; i++) {
            temp = p;
            p = q;
            q += temp;
        }
        return p + q;
    }

    /**
     * 迭代：超出时间限制
     * f(n) = f(n - 1) + f(n - 2)
     */
    int climbStairs1(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}

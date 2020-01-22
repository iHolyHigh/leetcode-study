package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0070-爬楼梯 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-15 23:24
 */
class No0070ClimbingStairsTest {
    void assertEquals(int n, int excepted) {
        No0070ClimbingStairs climbingStairs = new No0070ClimbingStairs();
        int actual = climbingStairs.climbStairs(n);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testClimbStairs1() {
        this.assertEquals(2, 2);
    }

    @Test
    void testClimbStairs2() {
        this.assertEquals(3, 3);
    }

    @Test
    void testClimbStairs3() {
        this.assertEquals(1, 1);
    }

    @Test
    void testClimbStairs4() {
        this.assertEquals(10, 89);
    }
}

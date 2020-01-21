package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0069-x的平方根 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-16 23:01
 */
class No0069SqrtXTest {
    void assertEquals(int x, int excepted) {
        No0069SqrtX sqrtX = new No0069SqrtX();
        int actual = sqrtX.mySqrt(x);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testMySqrt1() {
        this.assertEquals(4, 2);
    }

    @Test
    void testMySqrt2() {
        this.assertEquals(8, 2);
    }

    @Test
    void testMySqrt3() {
        this.assertEquals(0, 0);
    }

    @Test
    void testMySqrt4() {
        this.assertEquals(1, 1);
    }

    @Test
    void testMySqrt5() {
        this.assertEquals(10, 3);
    }

    @Test
    void testMySqrt6() {
        this.assertEquals(2147395600, 46340);
    }

    @Test
    void testMySqrt7() {
        this.assertEquals(2147483647, 46340);
    }
}

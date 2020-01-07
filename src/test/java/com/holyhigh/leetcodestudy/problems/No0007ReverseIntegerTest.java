package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0007-整数反转 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-07 23:44
 */
class No0007ReverseIntegerTest {
    @Test
    void testReverse1() {
        int x = 123;
        int excepted = 321;
        No0007ReverseInteger reverseInteger = new No0007ReverseInteger();
        int actual = reverseInteger.reverse(x);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testReverse2() {
        int x = -123;
        int excepted = -321;
        No0007ReverseInteger reverseInteger = new No0007ReverseInteger();
        int actual = reverseInteger.reverse(x);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testReverse3() {
        int x = 120;
        int excepted = 21;
        No0007ReverseInteger reverseInteger = new No0007ReverseInteger();
        int actual = reverseInteger.reverse(x);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testReverse4() {
        int x = Integer.MAX_VALUE;
        int excepted = 0;
        No0007ReverseInteger reverseInteger = new No0007ReverseInteger();
        int actual = reverseInteger.reverse(x);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testReverse5() {
        int x = Integer.MIN_VALUE;
        int excepted = 0;
        No0007ReverseInteger reverseInteger = new No0007ReverseInteger();
        int actual = reverseInteger.reverse(x);
        Assertions.assertEquals(excepted, actual);
    }
}

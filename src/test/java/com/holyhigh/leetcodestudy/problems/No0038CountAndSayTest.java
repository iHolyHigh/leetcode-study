package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0038-外观数列 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-12 22:56
 */
class No0038CountAndSayTest {
    void assertEquals(int n, String excepted) {
        No0038CountAndSay countAndSay = new No0038CountAndSay();
        String actual = countAndSay.countAndSay(n);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testCountAndSay1() {
        this.assertEquals(1, "1");
    }

    @Test
    void testCountAndSay2() {
        this.assertEquals(5, "111221");
    }

    @Test
    void testCountAndSay3() {
        this.assertEquals(10, "13211311123113112211");
    }
}

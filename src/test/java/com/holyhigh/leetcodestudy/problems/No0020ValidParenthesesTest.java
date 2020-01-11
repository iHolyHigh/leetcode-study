package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0020-有效的括号
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-10 23:25
 */
class No0020ValidParenthesesTest {
    void assertEquals(String s, boolean excepted) {
        No0020ValidParentheses validParentheses = new No0020ValidParentheses();
        boolean actual = validParentheses.isValid(s);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testIsValid1() {
        this.assertEquals("()", true);
    }

    @Test
    void testIsValid2() {
        this.assertEquals("()[]{}", true);
    }

    @Test
    void testIsValid3() {
        this.assertEquals("(]", false);
    }

    @Test
    void testIsValid4() {
        this.assertEquals("([)]", false);
    }

    @Test
    void testIsValid5() {
        this.assertEquals("{[]}", true);
    }

    @Test
    void testIsValid6() {
        this.assertEquals("", true);
    }

    @Test
    void testIsValid7() {
        this.assertEquals("{[(()])}", false);
    }

    @Test
    void testIsValid8() {
        this.assertEquals(")]", false);
    }

    @Test
    void testIsValid9() {
        this.assertEquals(")", false);
    }

    @Test
    void testIsValid10() {
        this.assertEquals("(])", false);
    }
}

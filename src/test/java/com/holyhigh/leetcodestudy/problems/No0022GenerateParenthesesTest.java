package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * No0022-括号生成
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-31 00:01
 */
class No0022GenerateParenthesesTest {
    void assertEquals(int n, List<String> excepted) {
        No0022GenerateParentheses generateParentheses = new No0022GenerateParentheses();
        List<String> actual = generateParentheses.generateParenthesis(n);
        Assertions.assertLinesMatch(excepted, actual);
    }

    @Test
    void testGenerateParentheses1() {
        List<String> excepted = new ArrayList<>();
        excepted.add("()()()");
        excepted.add("()(())");
        excepted.add("(())()");
        excepted.add("(()())");
        excepted.add("((()))");
        this.assertEquals(3, excepted);
    }

    @Test
    void testGenerateParentheses2() {
        List<String> excepted = new ArrayList<>();
        excepted.add("");
        this.assertEquals(0, excepted);
    }

    @Test
    void testGenerateParentheses3() {
        List<String> excepted = new ArrayList<>();
        excepted.add("()");
        this.assertEquals(1, excepted);
    }

    @Test
    void testGenerateParentheses4() {
        List<String> excepted = new ArrayList<>();
        excepted.add("()()");
        excepted.add("(())");
        this.assertEquals(2, excepted);
    }
}

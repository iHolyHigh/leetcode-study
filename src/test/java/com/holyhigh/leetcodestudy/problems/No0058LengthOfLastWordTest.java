package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0058-最后一个单词的长度 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-16 21:40
 */
class No0058LengthOfLastWordTest {
    void assertEquals(String s, int excepted) {
        No0058LengthOfLastWord lengthOfLastWord = new No0058LengthOfLastWord();
        int actual = lengthOfLastWord.lengthOfLastWord(s);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testLengthOfLastWord1() {
        this.assertEquals("Hello World", 5);
    }

    @Test
    void testLengthOfLastWord2() {
        this.assertEquals("Hello World ", 5);
    }

    @Test
    void testLengthOfLastWord3() {
        this.assertEquals(" ", 0);
    }

    @Test
    void testLengthOfLastWord4() {
        this.assertEquals("", 0);
    }
}

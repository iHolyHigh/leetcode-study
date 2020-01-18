package com.holyhigh.leetcodestudy.problems;

/**
 * No0058-最后一个单词的长度
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-16 21:33
 */
class No0058LengthOfLastWord {
    int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}

package com.holyhigh.leetcodestudy.problems;

/**
 * No0038-外观数列
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-12 22:23
 */
class No0038CountAndSay {
    String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String str = countAndSay(n - 1);
        char[] chars = str.toCharArray();
        char base = chars[0];
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (c == base) {
                count++;
                continue;
            }
            result.append(count).append(base);
            base = c;
            count = 1;
        }
        return result.append(count).append(base).toString();
    }
}

package com.holyhigh.leetcodestudy.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * No0013-罗马数字转整数
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-08 22:26
 */
class No0013RomanToInteger {
    int romanToInt(String s) {
        Map<String, Integer> romanAndInteger = new HashMap<>(13);
        romanAndInteger.put("I", 1);
        romanAndInteger.put("V", 5);
        romanAndInteger.put("X", 10);
        romanAndInteger.put("L", 50);
        romanAndInteger.put("C", 100);
        romanAndInteger.put("D", 500);
        romanAndInteger.put("M", 1000);
        romanAndInteger.put("IV", 4);
        romanAndInteger.put("IX", 9);
        romanAndInteger.put("XL", 40);
        romanAndInteger.put("XC", 90);
        romanAndInteger.put("CD", 400);
        romanAndInteger.put("CM", 900);
        int result = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (i <= len - 2 && romanAndInteger.containsKey(s.substring(i, i + 2))) {
                result += romanAndInteger.get(s.substring(i, i + 2));
                i++;
            } else {
                result += romanAndInteger.get(s.substring(i, i + 1));
            }
        }
        return result;
    }
}

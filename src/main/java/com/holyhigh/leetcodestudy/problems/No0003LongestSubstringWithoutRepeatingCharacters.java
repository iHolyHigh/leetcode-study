package com.holyhigh.leetcodestudy.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * No0003-无重复字符的最长子串
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-21 20:56
 */
class No0003LongestSubstringWithoutRepeatingCharacters {
    int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}

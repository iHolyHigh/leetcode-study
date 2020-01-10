package com.holyhigh.leetcodestudy.problems;

/**
 * No0014-最长公共前缀
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-10 21:32
 */
class No0014LongestCommonPrefix {
    String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; ) {
            if ("".equals(strs[i])) {
                return "";
            }
            if (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
                i = 1;
                continue;
            }
            i++;
        }
        return result;
    }
}

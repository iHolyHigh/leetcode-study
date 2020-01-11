package com.holyhigh.leetcodestudy.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * No0020-有效的括号
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-10 23:17
 */
class No0020ValidParentheses {
    boolean isValid(String s) {
        if ("".equals(s)) {
            return true;
        }
        Map<String, String> map = new HashMap<>(3);
        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String s1 = s.substring(i, i + 1);
            if (map.containsKey(s1)) {
                list.add(s1);
                continue;
            }
            int size = list.size();
            if (size == 0) {
                return false;
            }
            String s2 = list.get(size - 1);
            if (s1.equals(map.get(s2))) {
                list.remove(size - 1);
                continue;
            }
            return false;
        }
        return list.size() == 0;
    }
}

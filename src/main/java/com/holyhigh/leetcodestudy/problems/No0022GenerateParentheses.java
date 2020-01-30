package com.holyhigh.leetcodestudy.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * No0022-括号生成
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-30 23:56
 */
class No0022GenerateParentheses {
    List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if (n == 0) {
            ans.add("");
            return ans;
        }
        for (int c = 0; c < n; ++c) {
            for (String left : generateParenthesis(c)) {
                for (String right : generateParenthesis(n - 1 - c)) {
                    ans.add("(" + left + ")" + right);
                }
            }
        }
        return ans;
    }
}

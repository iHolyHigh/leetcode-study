package com.holyhigh.leetcodestudy.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * No0006-Z字形变换
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-02-05 23:31
 */
class No0006ZigzagConversion {
    String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ans = new StringBuilder();
        for (StringBuilder row : rows) {
            ans.append(row);
        }
        return ans.toString();
    }
}

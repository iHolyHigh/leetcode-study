package com.holyhigh.leetcodestudy.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * No0039-组合总和
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-02-03 23:26
 */
class No0039CombinationSum {
    private List<List<Integer>> res = new ArrayList<>();
    private int[] candidates;
    private int len;

    private void findCombinationSum(int residue, int start, Stack<Integer> pre) {
        if (residue < 0) {
            return;
        }
        if (residue == 0) {
            res.add(new ArrayList<>(pre));
            return;
        }
        for (int i = start; i < len; i++) {
            pre.add(candidates[i]);
            findCombinationSum(residue - candidates[i], i, pre);
            pre.pop();
        }
    }

    List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        if (len == 0) {
            return res;
        }
        this.len = len;
        this.candidates = candidates;
        findCombinationSum(target, 0, new Stack<>());
        return res;
    }
}

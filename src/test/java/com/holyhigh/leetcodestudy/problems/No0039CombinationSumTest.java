package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * No0039-组合总和
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-02-03 23:39
 */
class No0039CombinationSumTest {
    void assertEquals(int[] candidates, int target, List<List<Integer>> excepted) {
        No0039CombinationSum combinationSum = new No0039CombinationSum();
        List<List<Integer>> actual = combinationSum.combinationSum(candidates, target);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testCombinationSum1() {
        List<List<Integer>> excepted = new ArrayList<>();
        List<Integer> excepted1 = new ArrayList<>();
        List<Integer> excepted2 = new ArrayList<>();
        excepted.add(excepted1);
        excepted.add(excepted2);
        excepted1.add(2);
        excepted1.add(2);
        excepted1.add(3);
        excepted2.add(7);
        this.assertEquals(new int[]{2, 3, 6, 7}, 7, excepted);
    }

    @Test
    void testCombinationSum2() {
        List<List<Integer>> excepted = new ArrayList<>();
        List<Integer> excepted1 = new ArrayList<>();
        List<Integer> excepted2 = new ArrayList<>();
        List<Integer> excepted3 = new ArrayList<>();
        excepted.add(excepted1);
        excepted.add(excepted2);
        excepted.add(excepted3);
        excepted1.add(2);
        excepted1.add(2);
        excepted1.add(2);
        excepted1.add(2);
        excepted2.add(2);
        excepted2.add(3);
        excepted2.add(3);
        excepted3.add(3);
        excepted3.add(5);
        this.assertEquals(new int[]{2, 3, 5}, 8, excepted);
    }
}

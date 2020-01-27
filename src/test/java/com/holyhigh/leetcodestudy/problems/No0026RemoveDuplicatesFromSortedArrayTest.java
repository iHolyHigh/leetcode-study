package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0026-删除排序数组中的重复项 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-12 00:37
 */
class No0026RemoveDuplicatesFromSortedArrayTest {
    void assertEquals(int[] nums, int[] excepted) {
        No0026RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new No0026RemoveDuplicatesFromSortedArray();
        int actual = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        for (int i = 0; i < actual; i++) {
            Assertions.assertEquals(excepted[i], nums[i]);
        }
    }

    @Test
    void testRemoveDuplicates1() {
        int[] nums = {1, 1, 2};
        int[] excepted = {1, 2};
        this.assertEquals(nums, excepted);
    }

    @Test
    void testRemoveDuplicates2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 3};
        int[] excepted = {0, 1, 2, 3};
        this.assertEquals(nums, excepted);
    }

    @Test
    void testRemoveDuplicates3() {
        int[] nums = {0, 0};
        int[] excepted = {0};
        this.assertEquals(nums, excepted);
    }

    @Test
    void testRemoveDuplicates4() {
        int[] nums = {0};
        int[] excepted = {0};
        this.assertEquals(nums, excepted);
    }

    @Test
    void testRemoveDuplicates5() {
        int[] nums = {};
        int[] excepted = {};
        this.assertEquals(nums, excepted);
    }
}

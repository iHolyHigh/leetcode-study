package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0035-搜索插入位置 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-15 23:01
 */
class No0035SearchInsertPositionTest {
    void assertEquals(int[] nums, int target, int excepted) {
        No0035SearchInsertPosition searchInsertPosition = new No0035SearchInsertPosition();
        int actual = searchInsertPosition.searchInsert(nums, target);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testSearchInsert1() {
        int[] nums = {1, 3, 5, 6};
        this.assertEquals(nums, 5, 2);
    }

    @Test
    void testSearchInsert2() {
        int[] nums = {1, 3, 5, 6};
        this.assertEquals(nums, 2, 1);
    }

    @Test
    void testSearchInsert3() {
        int[] nums = {1, 3, 5, 6};
        this.assertEquals(nums, 7, 4);
    }

    @Test
    void testSearchInsert4() {
        int[] nums = {1, 3, 5, 6};
        this.assertEquals(nums, 0, 0);
    }

    @Test
    void testSearchInsert5() {
        int[] nums = {1};
        this.assertEquals(nums, 1, 0);
    }

    @Test
    void testSearchInsert6() {
        int[] nums = {0};
        this.assertEquals(nums, 0, 0);
    }
}

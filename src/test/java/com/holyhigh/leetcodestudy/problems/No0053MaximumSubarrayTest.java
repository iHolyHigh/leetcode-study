package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0053-最大子序和
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-19 23:06
 */
class No0053MaximumSubarrayTest {
    void assertEquals(int[] nums, int excepted) {
        No0053MaximumSubarray maximumSubarray = new No0053MaximumSubarray();
        int actual = maximumSubarray.maxSubArray(nums);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testMaxSubArray1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        this.assertEquals(nums, 6);
    }

    @Test
    void testMaxSubArray2() {
        int[] nums = {0};
        this.assertEquals(nums, 0);
    }

    @Test
    void testMaxSubArray3() {
        int[] nums = {-1};
        this.assertEquals(nums, -1);
    }

    @Test
    void testMaxSubArray4() {
        int[] nums = {-2, -1};
        this.assertEquals(nums, -1);
    }
}

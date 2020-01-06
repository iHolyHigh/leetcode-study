package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0001-两数之和 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-06 22:47
 */
class No0001TwoSumTest {
    @Test
    void testTwoSum1() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 9;
        No0001TwoSum twoSum = new No0001TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        Assertions.assertArrayEquals(new int[]{3, 4}, result);
    }

    @Test
    void testTwoSum2() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 10;
        No0001TwoSum twoSum = new No0001TwoSum();
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> twoSum.twoSum(nums, target));
        Assertions.assertEquals("nums is illegal!", exception.getMessage());
    }

}

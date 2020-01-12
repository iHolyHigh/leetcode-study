package com.holyhigh.leetcodestudy.problems;

/**
 * No0026-删除排序数组中的重复项
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-12 00:28
 */
class No0026RemoveDuplicatesFromSortedArray {
    int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        int result = 1;
        int base = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != base) {
                nums[result] = nums[i];
                base = nums[i];
                result++;
            }
        }
        return result;
    }
}

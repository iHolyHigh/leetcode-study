package com.holyhigh.leetcodestudy.problems;

/**
 * No0035-搜索插入位置
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-12 22:02
 */
class No0035SearchInsertPosition {
    int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}

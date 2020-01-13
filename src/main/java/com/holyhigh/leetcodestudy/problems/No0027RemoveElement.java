package com.holyhigh.leetcodestudy.problems;

/**
 * No0027-移除元素
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-12 16:19
 */
class No0027RemoveElement {
    int removeElement(int[] nums, int val) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}

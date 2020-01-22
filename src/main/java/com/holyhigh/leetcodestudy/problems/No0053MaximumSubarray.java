package com.holyhigh.leetcodestudy.problems;

/**
 * No0053-最大子序和
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-16 23:07
 */
class No0053MaximumSubarray {
    int maxSubArray(int[] nums) {
        int sum = 0, ans = nums[0];
        for (int num : nums) {
            sum += num;
            if (sum > ans) {
                ans = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}

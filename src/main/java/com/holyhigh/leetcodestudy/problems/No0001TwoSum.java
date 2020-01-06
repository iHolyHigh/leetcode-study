package com.holyhigh.leetcodestudy.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * No0001-两数之和
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-06 22:45
 */
class No0001TwoSum {
    int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("nums is illegal!");
    }
}

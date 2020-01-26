package com.holyhigh.leetcodestudy.problems;

/**
 * No0088-合并两个有序数组
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-16 23:11
 */
class No0088MergeSortedArray {
    /**
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(m+n)
     */
    void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n];
        int i = 0, j = 0, k = 0;
        for (; i < m && j < n; ) {
            nums[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        for (; i < m; ) {
            nums[k++] = nums1[i++];
        }
        for (; j < n; ) {
            nums[k++] = nums2[j++];
        }
        System.arraycopy(nums, 0, nums1, 0, m + n);
    }
}

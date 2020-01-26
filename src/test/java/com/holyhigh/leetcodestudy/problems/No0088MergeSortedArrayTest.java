package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0088-合并两个有序数组
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-19 22:12
 */
class No0088MergeSortedArrayTest {
    void assertEquals(int[] nums1, int m, int[] nums2, int n, int[] excepted) {
        No0088MergeSortedArray mergeSortedArray = new No0088MergeSortedArray();
        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertArrayEquals(excepted, nums1);
    }

    @Test
    void testMerge1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] excepted = {1, 2, 2, 3, 5, 6};
        this.assertEquals(nums1, 3, nums2, 3, excepted);
    }

    @Test
    void testMerge2() {
        int[] nums1 = {};
        int[] nums2 = {};
        int[] excepted = {};
        this.assertEquals(nums1, 0, nums2, 0, excepted);
    }

    @Test
    void testMerge3() {
        int[] nums1 = {1};
        int[] nums2 = {};
        int[] excepted = {1};
        this.assertEquals(nums1, 1, nums2, 0, excepted);
    }

    @Test
    void testMerge4() {
        int[] nums1 = {0};
        int[] nums2 = {2};
        int[] excepted = {2};
        this.assertEquals(nums1, 0, nums2, 1, excepted);
    }

    @Test
    void testMerge5() {
        int[] nums1 = {3, 4, 7, 8, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] excepted = {2, 3, 4, 5, 6, 7, 8};
        this.assertEquals(nums1, 4, nums2, 3, excepted);
    }
}

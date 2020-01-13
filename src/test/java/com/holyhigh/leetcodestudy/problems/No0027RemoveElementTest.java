package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0027-移除元素 测试
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-12 21:38
 */
class No0027RemoveElementTest {
    void assertEquals(int[] nums, int val, int[] excepted) {
        No0027RemoveElement removeElement = new No0027RemoveElement();
        int actual = removeElement.removeElement(nums, val);
        for (int i = 0; i < actual; i++) {
            Assertions.assertEquals(excepted[i], nums[i]);
        }
    }

    @Test
    void testRemoveElement1() {
        this.assertEquals(new int[]{3, 2, 2, 3}, 3, new int[]{2, 2});
    }

    @Test
    void testRemoveElement2() {
        this.assertEquals(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 1, 3, 0, 4});
    }

    @Test
    void testRemoveElement3() {
        this.assertEquals(new int[]{2, 2, 2}, 2, new int[]{});
    }

    @Test
    void testRemoveElement4() {
        this.assertEquals(new int[]{2}, 3, new int[]{2});
    }

    @Test
    void testRemoveElement5() {
        this.assertEquals(new int[]{2}, 2, new int[]{});
    }
}

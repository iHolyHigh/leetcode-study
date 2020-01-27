package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0002-两数相加
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-27 23:49
 */
class No0002AddTwoNumbersTest {
    void assertEquals(ListNode l1, ListNode l2, ListNode excepted) {
        No0002AddTwoNumbers addTwoNumbers = new No0002AddTwoNumbers();
        ListNode actual = addTwoNumbers.addTwoNumbers(l1, l2);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testAddTwoNumbers1() {
        ListNode l1 = ListNode.getListNode(new int[]{2, 4, 3});
        ListNode l2 = ListNode.getListNode(new int[]{5, 6, 4});
        ListNode excepted = ListNode.getListNode(new int[]{7, 0, 8});
        this.assertEquals(l1, l2, excepted);
    }

    @Test
    void testAddTwoNumbers2() {
        ListNode l1 = ListNode.getListNode(new int[]{});
        ListNode l2 = ListNode.getListNode(new int[]{});
        ListNode excepted = ListNode.getListNode(new int[]{});
        this.assertEquals(l1, l2, excepted);
    }

    @Test
    void testAddTwoNumbers3() {
        ListNode l1 = ListNode.getListNode(new int[]{9});
        ListNode l2 = ListNode.getListNode(new int[]{});
        ListNode excepted = ListNode.getListNode(new int[]{9});
        this.assertEquals(l1, l2, excepted);
    }

    @Test
    void testAddTwoNumbers4() {
        ListNode l1 = ListNode.getListNode(new int[]{9});
        ListNode l2 = ListNode.getListNode(new int[]{9});
        ListNode excepted = ListNode.getListNode(new int[]{8, 1});
        this.assertEquals(l1, l2, excepted);
    }

    @Test
    void testAddTwoNumbers5() {
        ListNode l1 = ListNode.getListNode(new int[]{9, 9});
        ListNode l2 = ListNode.getListNode(new int[]{9, 9});
        ListNode excepted = ListNode.getListNode(new int[]{8, 9, 1});
        this.assertEquals(l1, l2, excepted);
    }
}

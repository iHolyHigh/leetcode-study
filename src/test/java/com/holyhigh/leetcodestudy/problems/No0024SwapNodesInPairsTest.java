package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0024-两两交换链表中的节点
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-02-02 23:46
 */
class No0024SwapNodesInPairsTest {
    void assertEquals(ListNode head, ListNode excepted) {
        No0024SwapNodesInPairs swapNodesInPairs = new No0024SwapNodesInPairs();
        ListNode actual = swapNodesInPairs.swapPairs(head);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testSwapPairs1() {
        ListNode head = ListNode.getListNode(new int[]{1, 2, 3, 4});
        ListNode excepted = ListNode.getListNode(new int[]{2, 1, 4, 3});
        this.assertEquals(head, excepted);
    }

    @Test
    void testSwapPairs2() {
        ListNode head = ListNode.getListNode(new int[]{});
        ListNode excepted = ListNode.getListNode(new int[]{});
        this.assertEquals(head, excepted);
    }

    @Test
    void testSwapPairs3() {
        ListNode head = ListNode.getListNode(new int[]{1});
        ListNode excepted = ListNode.getListNode(new int[]{1});
        this.assertEquals(head, excepted);
    }

    @Test
    void testSwapPairs4() {
        ListNode head = ListNode.getListNode(new int[]{1, 2});
        ListNode excepted = ListNode.getListNode(new int[]{2, 1});
        this.assertEquals(head, excepted);
    }

    @Test
    void testSwapPairs5() {
        ListNode head = ListNode.getListNode(new int[]{1, 2, 3});
        ListNode excepted = ListNode.getListNode(new int[]{2, 1, 3});
        this.assertEquals(head, excepted);
    }
}

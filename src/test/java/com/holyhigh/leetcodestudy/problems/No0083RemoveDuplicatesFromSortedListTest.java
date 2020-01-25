package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0083-删除排序链表中的重复元素
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-18 23:17
 */
class No0083RemoveDuplicatesFromSortedListTest {
    void assertEquals(ListNode head, ListNode excepted) {
        No0083RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new No0083RemoveDuplicatesFromSortedList();
        ListNode actual = removeDuplicatesFromSortedList.deleteDuplicates(head);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testDeleteDuplicates1() {
        ListNode head = ListNode.getListNode(new int[]{1, 1, 2});
        ListNode excepted = ListNode.getListNode(new int[]{1, 2});
        this.assertEquals(head, excepted);
    }

    @Test
    void testDeleteDuplicates2() {
        ListNode head = ListNode.getListNode(new int[]{1, 1, 2, 3, 3});
        ListNode excepted = ListNode.getListNode(new int[]{1, 2, 3});
        this.assertEquals(head, excepted);
    }

    @Test
    void testDeleteDuplicates3() {
        ListNode head = ListNode.getListNode(new int[]{1, 2, 2, 3, 3, 3, 4, 5, 5, 6});
        ListNode excepted = ListNode.getListNode(new int[]{1, 2, 3, 4, 5, 6});
        this.assertEquals(head, excepted);
    }

    @Test
    void testDeleteDuplicates4() {
        ListNode head = ListNode.getListNode(new int[]{1});
        ListNode excepted = ListNode.getListNode(new int[]{1});
        this.assertEquals(head, excepted);
    }

    @Test
    void testDeleteDuplicates5() {
        ListNode head = ListNode.getListNode(new int[]{});
        ListNode excepted = ListNode.getListNode(new int[]{});
        this.assertEquals(head, excepted);
    }
}

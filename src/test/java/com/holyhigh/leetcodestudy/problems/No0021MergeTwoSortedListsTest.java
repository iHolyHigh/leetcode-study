package com.holyhigh.leetcodestudy.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * No0021-合并两个有序链表
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-11 22:22
 */
class No0021MergeTwoSortedListsTest {
    void assertEquals(int[] i1, int[] i2, int[] i3) {
        No0021MergeTwoSortedLists mergeTwoSortedLists = new No0021MergeTwoSortedLists();
        ListNode actual = mergeTwoSortedLists.mergeTwoLists(this.getListNode(i1), this.getListNode(i2));
        this.assertEquals(this.getListNode(i3), actual);
    }

    ListNode getListNode(int[] ints) {
        ListNode node = new ListNode(ints[0]);
        ListNode current = node;
        for (int i = 1; i < ints.length; i++) {
            current = current.next = new ListNode(ints[i]);
        }
        return node;
    }

    void assertEquals(ListNode excepted, ListNode actual) {
        while (excepted != null && actual != null) {
            Assertions.assertEquals(excepted.val, actual.val);
            excepted = excepted.next;
            actual = actual.next;
        }
        Assertions.assertNull(excepted);
        Assertions.assertNull(actual);
    }

    @Test
    void testMergeTwoLists1() {
        int[] i1 = {1, 2, 4};
        int[] i2 = {1, 3, 4};
        int[] i3 = {1, 1, 2, 3, 4, 4};
        this.assertEquals(i1, i2, i3);
    }

    @Test
    void testMergeTwoLists2() {
        int[] i1 = {1};
        int[] i2 = {4};
        int[] i3 = {1, 4};
        this.assertEquals(i1, i2, i3);
    }

    @Test
    void testMergeTwoLists3() {
        int[] i1 = {1, 2};
        int[] i2 = {4, 5, 6};
        int[] i3 = {1, 2, 4, 5, 6};
        this.assertEquals(i1, i2, i3);
    }

    @Test
    void testMergeTwoLists4() {
        int[] i1 = {1, 3, 5};
        int[] i2 = {2, 4, 6};
        int[] i3 = {1, 2, 3, 4, 5, 6};
        this.assertEquals(i1, i2, i3);
    }
}

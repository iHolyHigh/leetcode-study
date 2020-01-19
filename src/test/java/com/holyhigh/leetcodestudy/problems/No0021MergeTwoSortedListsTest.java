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
    void assertEquals(ListNode l1, ListNode l2, ListNode excepted) {
        No0021MergeTwoSortedLists mergeTwoSortedLists = new No0021MergeTwoSortedLists();
        ListNode actual = mergeTwoSortedLists.mergeTwoLists(l1, l2);
        Assertions.assertEquals(excepted, actual);
    }

    @Test
    void testMergeTwoLists1() {
        ListNode l1 = ListNode.getListNode(new int[]{1, 2, 4});
        ListNode l2 = ListNode.getListNode(new int[]{1, 3, 4});
        ListNode excepted = ListNode.getListNode(new int[]{1, 1, 2, 3, 4, 4});
        this.assertEquals(l1, l2, excepted);
    }

    @Test
    void testMergeTwoLists2() {
        ListNode l1 = ListNode.getListNode(new int[]{1});
        ListNode l2 = ListNode.getListNode(new int[]{4});
        ListNode excepted = ListNode.getListNode(new int[]{1, 4});
        this.assertEquals(l1, l2, excepted);
    }

    @Test
    void testMergeTwoLists3() {
        ListNode l1 = ListNode.getListNode(new int[]{1, 2});
        ListNode l2 = ListNode.getListNode(new int[]{4, 5, 6});
        ListNode excepted = ListNode.getListNode(new int[]{1, 2, 4, 5, 6});
        this.assertEquals(l1, l2, excepted);
    }

    @Test
    void testMergeTwoLists4() {
        ListNode l1 = ListNode.getListNode(new int[]{1, 3, 5});
        ListNode l2 = ListNode.getListNode(new int[]{2, 4, 6});
        ListNode excepted = ListNode.getListNode(new int[]{1, 2, 3, 4, 5, 6});
        this.assertEquals(l1, l2, excepted);
    }
}

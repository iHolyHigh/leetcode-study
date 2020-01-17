package com.holyhigh.leetcodestudy.problems;

/**
 * No0021-合并两个有序链表
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-11 22:21
 */
class No0021MergeTwoSortedLists {
    /**
     * 递归
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(m+n)
     */
    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        l2.next = mergeTwoLists(l1, l2.next);
        return l2;
    }

    /**
     * 迭代
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(1)
     */
    ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode prev = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return head.next;
    }
}

package com.holyhigh.leetcodestudy.problems;

/**
 * No0024-两两交换链表中的节点
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-02-02 23:40
 */
class No0024SwapNodesInPairs {
    ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}

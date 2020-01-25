package com.holyhigh.leetcodestudy.problems;

/**
 * No0083-删除排序链表中的重复元素
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-16 23:09
 */
class No0083RemoveDuplicatesFromSortedList {
    ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}

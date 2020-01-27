package com.holyhigh.leetcodestudy.problems;

/**
 * No0002-两数相加
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-21 20:10
 */
class No0002AddTwoNumbers {
    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1), current = head;
        int sum = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            current = current.next = new ListNode(sum >= 10 ? sum % 10 : sum);
            sum = sum >= 10 ? 1 : 0;
        }
        if (sum == 1) {
            current.next = new ListNode(1);
        }
        return head.next;
    }
}

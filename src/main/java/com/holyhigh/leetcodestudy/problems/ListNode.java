package com.holyhigh.leetcodestudy.problems;

import java.util.Objects;

/**
 * Definition for singly-linked list.
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-15 23:30
 */
class ListNode {
    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }

    static ListNode getListNode(int[] ints) {
        ListNode head = new ListNode(-1);
        ListNode current = head;
        for (int i : ints) {
            current = current.next = new ListNode(i);
        }
        return head.next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNode listNode = (ListNode) o;
        ListNode current = this;
        while (listNode != null && current != null) {
            if (listNode.val != current.val) {
                return false;
            }
            listNode = listNode.next;
            current = current.next;
        }
        return listNode == null && current == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}

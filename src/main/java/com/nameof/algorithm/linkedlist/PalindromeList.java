package com.nameof.algorithm.linkedlist;

public class PalindromeList {
    public static boolean isPalindrome(ListNode head) {
        // 中点
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }

        // 反转
        ListNode rightHead = reverse(slow);

        //从两端的头部开始判断
        ListNode left = head;
        ListNode right = rightHead;
        boolean result = true;
        while (right != null) {
            if (left.val != right.val) {
                result = false;
                break;
            }
            left = left.next;
            right = right.next;
        }

        //还原链表
        reverse(rightHead);
        return result;
    }

    private static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

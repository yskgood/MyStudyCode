package com.ysk.leetcode.list;

/**
 * 2. 两数相加
 * 思路：
 * 1、使用一个虚拟节点方便处理头部情况
 * 2、根据要求，节点的值要考虑进位相加，所以值取 %10的
 * 3、需要处理进位的情况，最后一个进位需要在循环外处理
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyNode = new ListNode(-1);
        ListNode pre = dummyNode;
        int re = 0;
        //如果有大于10就要进位
        while (l1 != null || l2 != null) {
            //细节点：值不能为空
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;

            int sum = l1Val + l2Val + re;
            //新生成一个节点
            ListNode node = new ListNode(sum % 10);
            pre.next = node;
            pre = node;
            //求进位的数
            re = sum / 10;

            //细节点：值不能为空
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (re != 0) {
            //还有一个节点
            ListNode node = new ListNode(re);
            pre.next = node;
        }

        return dummyNode.next;
    }
}

package com.ysk.leetcode.list;

/**
 * 206. 反转链表
 * 思路：
 * 1、使用前置节点，当前节点，后置节点 完成交换
 * 2、每次只需要交换一个，
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        while (head != null) {
            //记录下一个节点
            ListNode nextNode = head.next;
            //将当前节点指向上一个节点，完成当前节点的交换
            head.next = preNode;
            //移动到下个节点
            preNode = head;
            head = nextNode;
        }

        return preNode;
    }

}

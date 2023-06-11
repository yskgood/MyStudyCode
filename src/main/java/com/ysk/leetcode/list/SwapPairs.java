package com.ysk.leetcode.list;

/**
 * 24. 两两交换链表中的节点
 * 思路：
 * 1、交换的步骤用图示的方式画出来，标出1，2，3步，不要乱了
 * 2、使用前置节点，当前节点，后置节点 完成交换
 *
 * @see ReverseList
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        //只有一个节点的直接返回
        if (head == null || head.next == null) {
            return head;
        }
        //先记录第一个位置
        ListNode currentNode = head;
        ListNode preNode = new ListNode(-1, head);
        //先指向下个交换后的位置
        head = currentNode.next;


        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            if (nextNode == null) {
                break;
            }
            //第一步
            preNode.next = nextNode;
            //第二步
            currentNode.next = nextNode.next;
            //第三步
            nextNode.next = currentNode;

            //移动到下个位置
            preNode = currentNode;
            currentNode = currentNode.next;
        }

        return head;
    }

}

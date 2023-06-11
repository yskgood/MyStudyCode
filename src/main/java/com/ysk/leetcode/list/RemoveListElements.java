package com.ysk.leetcode.list;

/**
 * 203. 移除链表元素
 */
public class RemoveListElements {
    public static ListNode removeElements(ListNode head, int val) {
        //添加一个虚拟节点
        ListNode dummyNode = new ListNode(-1, head);
        ListNode preNode = dummyNode;
        while (head != null) {
            if (head.val == val) {
                //删除一个节点就将前一个节点的next跳过当前
                preNode.next = head.next;
            } else {
                preNode = head;
            }
            //移动到下一个
            head = head.next;
        }

        return dummyNode.next;
    }


}


package com.ysk.leetcode.list;

/**
 * 19. 删除链表的倒数第 N 个结点
 * 怎么快速找到倒数N个节点？
 * 定义两个指针，如果两个两个指针距离为N且，后面一个已经在尾部，前面的那个就是要删除的位置
 * 定义一个虚拟节点，从虚拟节点开始，方便处理
 */
public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        //同时从虚拟节点开始方便处理头部情况
        ListNode dummyNode = new ListNode(-1, head);
        ListNode fastNode = dummyNode;
        ListNode slowNode = dummyNode;

        //先移动Fast N+1个位置,这样Slow后续正好是删除位置的前一个位置
        for (int i = 0; i <= n; i++) {
            fastNode = fastNode.next;
            if (fastNode == null) {
                break;
            }
        }

        //开始同步移动
        while (fastNode != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }

        //待删除的节点
        ListNode delNode = slowNode.next;
        slowNode.next = delNode.next;
        delNode.next = null;

        return dummyNode.next;
    }


}

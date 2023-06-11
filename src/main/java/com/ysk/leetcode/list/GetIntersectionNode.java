package com.ysk.leetcode.list;

/**
 * 面试题 02.07. 链表相交
 * 注意：相交不是数值相同，而是节点相同
 */
public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode curA = headA;
        ListNode curB = headB;

        //从对齐的位置开始比较，所以要先算出边的长度
        int lenA = 0;
        int lenB = 0;

        //节省部分循环的时间
        while (headA != null || headB != null) {
            if (headA != null) {
                lenA++;
                headA = headA.next;
            }
            if (headB != null) {
                lenB++;
                headB = headB.next;
            }
        }

        //两个对齐
        if (lenA > lenB) {
            //移动A到B的相同位置
            for (int i = 0; i < lenA - lenB; i++) {
                curA = curA.next;
            }

        } else if (lenB > lenA) {
            //移动B到A的位置
            for (int i = 0; i < lenB - lenA; i++) {
                curB = curB.next;
            }
        }

        //逐个进行比较
        while (curA != null && curB != null) {
            // 注意：相交不是数值相同，而是节点相同
            if (curA == curB) {
                return curA;
            }

            curA = curA.next;
            curB = curB.next;
        }


        return null;
    }

}

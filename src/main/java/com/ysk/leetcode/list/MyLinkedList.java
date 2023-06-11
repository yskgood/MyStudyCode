package com.ysk.leetcode.list;

class MyLinkedList {

    ListNode head = null;
    ListNode tail = null;

    public MyLinkedList() {

    }

    public int get(int index) {
        ListNode node = getNodeByIndex(index);
        if (node != null) {
            return node.val;
        }
        return -1;
    }

    private ListNode getNodeByIndex(int index) {
        int i = 0;
        ListNode node = head;
        while (node != null) {
            if (i == index) {
                return node;
            }
            i++;
            node = node.next;
        }
        return null;
    }

    public void addAtHead(int val) {
        if (head == null) {
            tail = head = new ListNode(val);
        } else {
            ListNode node = new ListNode(val, head);
            head = node;
        }
    }

    public void addAtTail(int val) {
        if (tail == null) {
            tail = head = new ListNode(val);
        } else {
            ListNode node = new ListNode(val);
            tail.next = node;
            tail = node;
        }
    }

    public void addAtIndex(int index, int val) {
        int i = 0;
        ListNode pre = new ListNode(-1, head);
        while (pre != null) {
            if (index == i) {
                //生成一个新节点
                ListNode node = new ListNode(val, pre.next);
                pre.next = node;
                if (index == 0) {
                    //插入的是头节点
                    head = node;
                }
                //如果插入的是尾部，更新尾部节点
                if (node.next == null) {
                    tail = node;
                }
                break;
            }

            pre = pre.next;
            i++;

        }

    }

    public void deleteAtIndex(int index) {
        int i = 0;
        ListNode pre = new ListNode(-1, head);
        while (pre != null && pre.next != null) {
            //找到对应坐标开始删除
            if (index == i) {
                ListNode findNode = pre.next;
                pre.next = findNode.next;
                findNode.next = null;
                //更新头部
                if (index == 0) {
                    head = pre.next;
                }
                //更新尾部
                if (pre.next == null) {
                    tail = pre;
                }

                break;
            }
            pre = pre.next;
            i++;
        }
    }
}

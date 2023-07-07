package com.ysk.leetcode.list;

/**
 * @author ysk
 * @date 2023/7/3 4:55 PM
 */
public class MyLinkedList2 {

    private Node head;
    private Node tail;

    public MyLinkedList2() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        return 0;
    }

    public void addAtHead(int val) {

    }

    public void addAtTail(int val) {

    }

    public void addAtIndex(int index, int val) {

    }

    public void deleteAtIndex(int index) {

    }

    private static class Node {
        int item;
        Node next;
        Node prev;

        public Node(Node pre, int item, Node next) {
            this.prev = pre;
            this.item = item;
            this.next = next;
        }
    }
}

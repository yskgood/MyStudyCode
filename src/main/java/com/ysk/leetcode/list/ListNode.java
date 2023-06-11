package com.ysk.leetcode.list;

import com.alibaba.fastjson2.JSON;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }

    public static ListNode build(int[] array) {
        ListNode head = new ListNode(array[0], null);
        ListNode pre = head;
        for (int i = 1; i < array.length; i++) {
            ListNode item = new ListNode(array[i], null);
            pre.next = item;
            pre = item;
        }
        return head;
    }

    public static void print(ListNode resultNode) {
        while (resultNode != null) {
            System.out.println(resultNode.val);
            //移动下一个节点
            resultNode = resultNode.next;
        }
    }

    public static String toJSONString(ListNode resultNode) {
        if (resultNode == null) {
            return "[]";
        }
        List<Integer> ls = new ArrayList<>();
        while (resultNode != null) {
            ls.add(resultNode.val);
            //移动下一个节点
            resultNode = resultNode.next;
        }
        return JSON.toJSONString(ls.toArray());
    }
}

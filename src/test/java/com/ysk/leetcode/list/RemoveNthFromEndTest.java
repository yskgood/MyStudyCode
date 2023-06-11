package com.ysk.leetcode.list;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveNthFromEndTest {

    @Test
    public void test() {
        Assert.assertEquals(ListNode.toJSONString(RemoveNthFromEnd.removeNthFromEnd(ListNode.build(new int[]{1, 2, 3}), 3)), "[2,3]");
        Assert.assertEquals(ListNode.toJSONString(RemoveNthFromEnd.removeNthFromEnd(ListNode.build(new int[]{1}), 1)), "[]");
        Assert.assertEquals(ListNode.toJSONString(RemoveNthFromEnd.removeNthFromEnd(ListNode.build(new int[]{1, 2, 3, 4, 5}), 2)), "[1,2,3,5]");
    }
}
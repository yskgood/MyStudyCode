package com.ysk.leetcode.list;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {

        Assert.assertEquals(ListNode.toJSONString(AddTwoNumbers.addTwoNumbers(ListNode.build(new int[]{2, 4, 3}), ListNode.build(new int[]{5, 6, 4}))), "[7,0,8]");
    }
}
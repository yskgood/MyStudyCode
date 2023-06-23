package com.ysk.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class StackTest {

    @Test
    public void test() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        Assert.assertTrue(stack.peek().equals(4));
        Assert.assertTrue(stack.pop().equals(4));
        Assert.assertTrue(stack.isEmpty());
    }
}

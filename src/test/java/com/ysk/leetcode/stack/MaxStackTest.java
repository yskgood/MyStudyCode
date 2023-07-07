package com.ysk.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxStackTest {

    @Test
    public void test() {
        MaxStack maxStack = new MaxStack();
        maxStack.push(-23);
        System.out.println(maxStack.peekMax());
        maxStack.push(-74);
        System.out.println(maxStack.popMax());
        maxStack.push(-4);
        maxStack.push(20);
        maxStack.push(68);
        System.out.println(maxStack.top());
        maxStack.push(83);
        System.out.println(maxStack.peekMax());
        maxStack.push(73);
        maxStack.push(71);
        maxStack.push(93);
        System.out.println(maxStack.popMax());
        System.out.println(maxStack.popMax());
        System.out.println(maxStack.popMax());
        System.out.println(maxStack.popMax());
    }
}
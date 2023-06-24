package com.ysk.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvalRPNTest {

    @Test
    public void test() {
        Assert.assertEquals(EvalRPN.evalRPN(new String[]{"2", "1", "+", "3", "*"}), 9);
        Assert.assertEquals(EvalRPN.evalRPN(new String[]{"4", "13", "5", "/", "+"}), 6);
        Assert.assertEquals(EvalRPN.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}), 22);
    }
}
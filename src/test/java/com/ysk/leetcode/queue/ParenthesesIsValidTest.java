package com.ysk.leetcode.queue;


import org.junit.Assert;
import org.junit.Test;


public class ParenthesesIsValidTest {

    @Test
    public void isValid() {
        Assert.assertTrue(ParenthesesIsValid.isValid("()"));
        Assert.assertFalse(ParenthesesIsValid.isValid("([)]"));
    }
}
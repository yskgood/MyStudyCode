package com.ysk.leetcode.queue;


import com.ysk.leetcode.stack.ParenthesesIsValid;
import org.junit.Assert;
import org.junit.Test;


public class ParenthesesIsValidTest {

    @Test
    public void isValid() {
        Assert.assertTrue(ParenthesesIsValid.isValid("()"));
        Assert.assertFalse(ParenthesesIsValid.isValid("([)]"));
    }
}
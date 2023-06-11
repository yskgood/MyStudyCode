package com.ysk.leetcode.array.window;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinWindowTest {

    @Test
    public void test2() {
        Assert.assertEquals(MinWindow.minWindow("a", "aa"), "");
        Assert.assertEquals(MinWindow.minWindow("ADOBECODEBANC", "ABC"), "BANC");
        Assert.assertEquals(MinWindow.minWindow("abc", "a"), "a");
        Assert.assertEquals(MinWindow.minWindow("abc", "c"), "c");
        Assert.assertEquals(MinWindow.minWindow("a", "a"), "a");

    }
}
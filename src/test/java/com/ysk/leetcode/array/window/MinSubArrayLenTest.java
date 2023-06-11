package com.ysk.leetcode.array.window;

import org.junit.Assert;
import org.junit.Test;

public class MinSubArrayLenTest {

    @Test
    public void test() {
        Assert.assertEquals(MinSubArrayLen.minSubArrayLen(4, new int[]{4, 2, 2}), 1);
        Assert.assertEquals(MinSubArrayLen.minSubArrayLen(4, new int[]{1, 4, 4}), 1);
        Assert.assertEquals(MinSubArrayLen.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}), 2);
        Assert.assertEquals(MinSubArrayLen.minSubArrayLen(4, new int[]{}), 0);
    }
}
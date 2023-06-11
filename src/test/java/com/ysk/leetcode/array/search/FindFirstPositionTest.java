package com.ysk.leetcode.array.search;

import org.junit.Assert;
import org.junit.Test;

public class FindFirstPositionTest {

    @Test
    public void test() {
        Assert.assertEquals(FindFirstPosition.findFirstPosition(new int[]{5, 7, 7, 8, 8, 10}, 8), 3);
        Assert.assertEquals(FindFirstPosition.findFirstPosition(new int[]{5, 7, 7, 8, 8, 10}, 5), 0);
        Assert.assertEquals(FindFirstPosition.findFirstPosition(new int[]{5, 7, 7, 8, 8, 10}, 6), -1);
        Assert.assertEquals(FindFirstPosition.findFirstPosition(new int[]{5, 7, 7, 8, 8, 10}, 10), 5);
        Assert.assertEquals(FindFirstPosition.findFirstPosition(new int[]{5, 7, 8, 8, 8, 10}, 8), 2);
    }

}
package com.ysk.leetcode.array.search;

import org.junit.Assert;
import org.junit.Test;
import com.ysk.leetcode.array.search.FindLastPosition;

import static org.junit.Assert.*;

public class FindLastPositionTest {

    @Test
    public void test() {

        Assert.assertEquals(FindLastPosition.findLastPosition(new int[]{5, 7, 7, 8, 8, 10}, 8), 4);
        Assert.assertEquals(FindLastPosition.findLastPosition(new int[]{5, 7, 7, 8, 8, 10}, 5), 0);
        Assert.assertEquals(FindLastPosition.findLastPosition(new int[]{5, 7, 7, 8, 8, 10}, 6), -1);
        Assert.assertEquals(FindLastPosition.findLastPosition(new int[]{5, 7, 7, 8, 8, 10}, 10), 5);
        Assert.assertEquals(FindLastPosition.findLastPosition(new int[]{5, 7, 8, 8, 8, 10}, 8), 4);
    }
}
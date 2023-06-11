package com.ysk.leetcode.array.search;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchRangeTest {

    @Test
    public void test() {
        Assert.assertArrayEquals(BinarySearchRange.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8), new int[]{3, 4});
        Assert.assertArrayEquals(BinarySearchRange.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6), new int[]{-1, -1});
        Assert.assertArrayEquals(BinarySearchRange.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 5), new int[]{0, 0});
        Assert.assertArrayEquals(BinarySearchRange.searchRange(new int[]{}, 0), new int[]{-1, -1});
    }
}
package com.ysk.leetcode.hash;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ysk
 * @date 2023/6/14 4:22 PM
 */
class FourSumCountTest {

    @Test
    void fourSumCount() {
        Assert.assertEquals(FourSumCount.fourSumCount3(new int[]{-1, -1}, new int[]{-1, 1}, new int[]{-1, 1}, new int[]{1, -1}), 6);
        Assert.assertEquals(FourSumCount.fourSumCount3(new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0}), 1);
    }
}
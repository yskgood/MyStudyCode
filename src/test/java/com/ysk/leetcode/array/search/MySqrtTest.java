package com.ysk.leetcode.array.search;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ysk
 * @date 2023/6/12 5:39 PM
 */
public class MySqrtTest {

    @Test
    public void test() {
        Assert.assertEquals(MySqrt.mySqrt(4), 2);
        Assert.assertEquals(MySqrt.mySqrt(8), 2);
    }
}
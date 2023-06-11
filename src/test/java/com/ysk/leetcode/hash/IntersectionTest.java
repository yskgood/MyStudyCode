package com.ysk.leetcode.hash;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectionTest {

    @Test
    public void test() {
        Assert.assertArrayEquals(Intersection.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}), new int[]{2});
    }
}
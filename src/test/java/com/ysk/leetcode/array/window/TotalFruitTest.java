package com.ysk.leetcode.array.window;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TotalFruitTest {

    @Test
    public void test() {
        Assert.assertEquals(TotalFruit.totalFruit(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}), 5);
        Assert.assertEquals(TotalFruit.totalFruit(new int[]{}), 0);
        Assert.assertEquals(TotalFruit.totalFruit(new int[]{1}), 1);
        Assert.assertEquals(TotalFruit.totalFruit(new int[]{1, 2}), 2);
        Assert.assertEquals(TotalFruit.totalFruit(new int[]{1, 2, 3, 2, 2}), 4);
        Assert.assertEquals(TotalFruit.totalFruit(new int[]{0, 0, 1, 1}), 4);
        Assert.assertEquals(TotalFruit.totalFruit(new int[]{0, 1, 2, 2}), 3);
        Assert.assertEquals(TotalFruit.totalFruit(new int[]{1, 2, 1}), 3);

    }
}
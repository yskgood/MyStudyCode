package com.ysk.leetcode.array.matrix;

import com.alibaba.fastjson2.JSON;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpiralOrderTest {

    @Test
    public void test() {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Assert.assertEquals("[1,2,3,4,8,12,11,10,9,5,6,7]", JSON.toJSONString(SpiralOrder.spiralOrder(matrix)));

        matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Assert.assertEquals("[1,2,3,6,9,8,7,4,5]", JSON.toJSONString(SpiralOrder.spiralOrder(matrix)));

        matrix = new int[][]{{1}, {2}, {3}};
        Assert.assertEquals("[[1,2,3]]", JSON.toJSONString(SpiralOrder.spiralOrder(matrix)));

        matrix = new int[][]{{1, 2, 3}};
        Assert.assertEquals("[[1,2,3]]", JSON.toJSONString(SpiralOrder.spiralOrder(matrix)));
    }

}
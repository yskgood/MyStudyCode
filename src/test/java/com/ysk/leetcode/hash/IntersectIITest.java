package com.ysk.leetcode.hash;

import com.alibaba.fastjson2.JSON;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntersectIITest {

    @Test
    public void test() {

        System.out.println(JSON.toJSONString(IntersectII.intersectSorted(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
        System.out.println(JSON.toJSONString(IntersectII.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(JSON.toJSONString(IntersectII.intersectSorted(new int[]{1, 1, 2, 2, 4}, new int[]{1, 2, 2, 3})));
    }

}
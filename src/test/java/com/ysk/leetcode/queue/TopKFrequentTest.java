package com.ysk.leetcode.queue;

import com.alibaba.fastjson2.JSON;
import org.junit.Test;

import static org.junit.Assert.*;

public class TopKFrequentTest {

    @Test
    public void test() {
        System.out.println(JSON.toJSONString(TopKFrequent.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
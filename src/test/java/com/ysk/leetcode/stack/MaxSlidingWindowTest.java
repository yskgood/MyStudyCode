package com.ysk.leetcode.stack;

import com.alibaba.fastjson2.JSON;
import com.ysk.leetcode.queue.MaxSlidingWindow;
import org.junit.Test;

public class MaxSlidingWindowTest {

    @Test
    public void test() {

        System.out.println(JSON.toJSONString(MaxSlidingWindow.maxSlidingWindow2(new int[]{1, -9, 8, -6, 6, 4, 0, 5}, 4)));
        System.out.println(JSON.toJSONString(MaxSlidingWindow.maxSlidingWindow2(new int[]{9, 10, 9, -7, -4, -8, 2, -6}, 5)));
        System.out.println(JSON.toJSONString(MaxSlidingWindow.maxSlidingWindow2(new int[]{1, 3, 1, 2, 0, 5}, 3)));
        System.out.println(JSON.toJSONString(MaxSlidingWindow.maxSlidingWindow2(new int[]{7, 2, 4}, 2)));
        System.out.println(JSON.toJSONString(MaxSlidingWindow.maxSlidingWindow2(new int[]{1, -1}, 1)));
        System.out.println(JSON.toJSONString(MaxSlidingWindow.maxSlidingWindow2(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }

}
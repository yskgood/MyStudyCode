package com.ysk.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    @Test
    public void test() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue);

        Assert.assertTrue(queue.poll().equals(1));

        System.out.println(queue);

        Assert.assertTrue(queue.peek().equals(2));
        System.out.println(queue);
    }
}

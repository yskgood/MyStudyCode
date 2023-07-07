package com.ysk.util;

import com.alibaba.fastjson2.JSON;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class QueueTest {

    @Test
    public void testQueue() {
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

    @Test
    public void testDeque() {
        Deque<Integer> deque = new LinkedList<>();
        deque.offer(1);
        deque.offer(2);
        Assert.assertTrue(deque.poll().equals(1));
        Assert.assertTrue(deque.peek().equals(2));
    }

    @Test
    public void testPriorityQueue() {
        //实现原理：https://blog.csdn.net/Seky_fei/article/details/106594092
        /**
         * 基于数组实现的二叉堆具有以下特征：
         * 1. 对于任意索引为 i 的节点，它的左子节点的索引为 2i+1，右子节点的索引为 2i+2；
         * 2. 对于任意索引为 i 的节点，它的父节点的索引为 (i-1)/2；
         * 3. 数组表示的二叉堆是一个完全二叉树，即除了最后一层节点可能不满之外，其他层都是满的，并且最后一层节点都靠左排列；
         * 4. 对于最小堆，对于任何节点 i，它的左右子节点的值都大于等于节点 i 的值。也就是说，最小堆中，根节点是最小值；
         * 5. 对于最大堆，对于任何节点 i，它的左右子节点的值都小于等于节点 i 的值。也就是说，最大堆中，根节点是最大值。
         * 基于数组实现的二叉堆是一种高效的数据结构，它可以用来实现优先队列等应用。
         * 由于二叉堆维护了一定的排序关系，因此在查找最大或最小元素、删除最大或最小元素等操作上具有优势。
         * 与红黑树等其他数据结构相比，基于数组实现的二叉堆空间占用更少，但插入和删除操作的时间复杂度更高。
         */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(2);
        priorityQueue.offer(5);
        priorityQueue.offer(4);
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}

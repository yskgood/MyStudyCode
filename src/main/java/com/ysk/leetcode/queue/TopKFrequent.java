package com.ysk.leetcode.queue;

import java.util.*;

public class TopKFrequent {

    /**
     * 347. 前 K 个高频元素
     * 思路：
     * 1、要统计元素出现频率
     * 2、对频率排序--优先队列
     * 3、找出前K个高频元素
     *
     * @param nums
     * @param k
     * @return
     */
    public static int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        //先统计出每个元素的数量
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }
        //计算前K个高频元素
        //定义一个优先队列
        PriorityQueue<Integer[]> priorityQueue = new PriorityQueue<>(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                //使用倒叙的方式
                return o2[1].compareTo(o1[1]);
            }
        });

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            priorityQueue.offer(new Integer[]{entry.getKey(), entry.getValue()});
        }

        //取出K个元素
        for (int i = 0; i < k; i++) {//依次从队头弹出k个,就是出现频率前k高的元素
            ans[i] = priorityQueue.poll()[0];
        }

        return ans;
    }
}

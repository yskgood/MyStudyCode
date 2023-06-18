package com.ysk.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 454. 四数相加 II
 * 相加为为0
 * 思路：
 * 如何使用哈希表降低遍历次数？
 * 先算出前两组的和，在计算后两组合去负数后在哈希表快查
 * 将O(n^4)转换成O(2n^2)复杂度
 */
public class FourSumCount {

    /**
     * 暴力解法
     *
     * @param nums1
     * @param nums2
     * @param nums3
     * @param nums4
     * @return
     */
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int findCount = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                for (int k = 0; k < nums3.length; k++) {
                    for (int l = 0; l < nums4.length; l++) {
                        long sum = (long) nums1[i] + nums2[j] + nums3[k] + nums4[l];
                        if (sum == 0) {
                            findCount++;
                        }
                    }
                }
            }
        }
        return findCount;
    }

    /**
     * 使用哈希表快查
     *
     * @param nums1
     * @param nums2
     * @param nums3
     * @param nums4
     * @return
     */
    public static int fourSumCount2(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int findCount = 0;
        //分组
        Map<Long, Integer> groupA = group(nums1, nums2);
        Map<Long, Integer> groupB = group(nums3, nums4);

        for (Map.Entry<Long, Integer> entry : groupA.entrySet()) {
            long target = -entry.getKey();
            if (groupB.containsKey(target)) {
                //注意：这里笛卡尔积，用相乘
                findCount += entry.getValue() * groupB.get(target);
            }
        }

        return findCount;
    }

    /**
     * 类似2，第二组直接处理
     *
     * @param nums1
     * @param nums2
     * @param nums3
     * @param nums4
     * @return
     */
    public static int fourSumCount3(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int findCount = 0;
        //分组
        Map<Long, Integer> groupA = group(nums1, nums2);

        for (int k = 0; k < nums3.length; k++) {
            for (int l = 0; l < nums4.length; l++) {
                long key = -((long) nums3[k] + nums4[l]);
                //说明相加==0
                if (groupA.containsKey(key)) {
                    //注意：这里需要累加上出现的次数
                    findCount += groupA.get(key);
                }
            }
        }

        return findCount;
    }

    /**
     * key：两个元素的合
     * val：出现的次数
     *
     * @param nums1
     * @param nums2
     * @return
     */
    private static Map<Long, Integer> group(int[] nums1, int[] nums2) {
        Map<Long, Integer> group = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                long sum = (long) nums1[i] + nums2[j];
                group.put(sum, group.getOrDefault(sum, 0) + 1);
            }
        }
        return group;
    }
}

package com.ysk.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 349. 两个数组的交集
 * 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 * 思路：
 * 1、相交代表在两边数组都有
 * 2、输出结果每一个都是唯一的，需要去重，使用Set实现
 */
public class Intersection {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1Set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }
        Set<Integer> resultSet = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            //将相交的结果放入结果中
            if (nums1Set.contains(nums2[i])) {
                resultSet.add(nums2[i]);
            }
        }
        //处理结果
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (Integer num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}

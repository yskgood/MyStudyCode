package com.ysk.leetcode.hash;

import java.util.*;

/**
 * 350. 两个数组的交集 II
 * 变化点：返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）
 * 思路：
 * 1、用哈希表将将数字出现的次数都统计下
 * 2、如果出现两个哈希表中说明相交，注意：如果出现次数不一致，则考虑取较小值
 */
public class IntersectII {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> nums1Map = countNums(nums1);
        Map<Integer, Integer> nums2Map = countNums(nums2);
        for (Map.Entry<Integer, Integer> entry : nums1Map.entrySet()) {
            if (nums2Map.containsKey(entry.getKey())) {
                //注意：相交了，取数量最小值
                int minCount = Math.min(entry.getValue(), nums2Map.get(entry.getKey()));
                //放入值
                for (int i = 0; i < minCount; i++) {
                    result.add(entry.getKey());
                }
            }
        }

        return result.stream().mapToInt(Integer::valueOf).toArray();
    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = countNums(nums1);
        //结果不会超过短的长度
        int[] intersection = new int[nums1.length];
        //记录写入到哪里了
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }

    /**
     * 统计每个数字出现的次数
     *
     * @param nums
     * @return
     */
    private static Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }
        return countMap;
    }

    /**
     * 如果给定的数组已经排好序呢？你将如何优化你的算法？
     * 1、排好序的可以用双指针
     * 2、必须用短的找长的，一个指针指向短的，一个指向长的
     *
     * @param shortArray
     * @param longArray
     * @return
     */
    public static int[] intersectSorted(int[] shortArray, int[] longArray) {
        if (shortArray.length > longArray.length) {
            return intersectSorted(longArray, shortArray);
        }

        Arrays.sort(shortArray);
        Arrays.sort(longArray);

        List<Integer> result = new ArrayList<>();
        int shortIndex = 0;
        int longIndex = 0;
        while (shortIndex < shortArray.length) {
            int num1 = shortArray[shortIndex];
            boolean find = false;
            while (longIndex < longArray.length) {
                //找到了退出
                if (num1 == longArray[longIndex]) {
                    //注意：当前的已经找过了，需要跳过
                    longIndex++;
                    find = true;
                    break;
                }
                //注意：如果已经大于当前值了退出
                if (num1 < longArray[longIndex]) {
                    break;
                }
                longIndex++;
            }
            if (find) {
                result.add(num1);
            }
            shortIndex++;

        }

        return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}

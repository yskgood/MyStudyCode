package com.ysk.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 思路：
 * 使用空间换时间，
 * 使用查表法
 * 两个值和为target，每次查询 target-当前坐标 所对应的值是否在Map中，如果在就返回，否则就将当前坐标放入Map
 * <p>
 * 注意：你可以按任意顺序返回答案
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int mus = target - val;
            if (valIndexMap.containsKey(mus)) {
                return new int[]{i, valIndexMap.get(mus)};
            } else {
                valIndexMap.put(val, i);
            }
        }
        return null;
    }
}

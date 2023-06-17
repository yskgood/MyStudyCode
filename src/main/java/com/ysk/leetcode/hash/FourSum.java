package com.ysk.leetcode.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18. 四数之和
 * 思路和三数之合类似
 * 关键点在于去重逻辑处理，相同的元素如果之前的元素处理过，下次循环就不要再处理了
 */
public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        //开始处理
        for (int i = 0; i < nums.length; i++) {
            //跳过重复的
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                //跳过重复的
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                //定义两个指针，通过两个指针的移动，不断去找
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        //同时移动，继续寻找
                        left++;
                        right--;
                        //避免重复
                        while (left < right && (nums[left] == nums[left - 1])) {
                            left++;
                        }
                        while (left < right && (nums[right] == nums[right + 1])) {
                            right--;
                        }
                    } else if (sum > target) {
                        //缩小范围
                        right--;
                    } else {
                        //增加范围
                        left++;
                    }
                }
            }
        }
        return ans;
    }
}

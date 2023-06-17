package com.ysk.leetcode.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 * 思路
 * 1、排序，方便去重复处理
 * 2、使用双指针可以避免三重循环
 * 3、避免重复，利用排序的特种跳过一样的元素
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        //自然排序，排序后方便处理
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            //避免重复
            if (i > 0 && (nums[i] == nums[i - 1])) {
                continue;
            }
            //定义两个指针，i+1和尾部开始找
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                long sum = (long) nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    //找到了目标
                    ls.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //同时两个指针（如果不重复的情况下，只移动一个，下次肯定不相等），继续寻找
                    left++;
                    right--;
                    //避免重复,跳过一样的
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum > target) {
                    //比目标值大，需要缩小，右移动
                    right--;
                } else {
                    //比目标值小，需要放大，左移动
                    left++;
                }
            }
        }
        return ls;
    }
}

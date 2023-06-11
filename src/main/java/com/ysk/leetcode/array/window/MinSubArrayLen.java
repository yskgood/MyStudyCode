package com.ysk.leetcode.array.window;

/**
 * 209. 长度最小的子数组
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组
 * 思路：
 * 1、快慢指针的滑动窗口
 * 2、不断缩小查询范围
 */
public class MinSubArrayLen {

    public static int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int slowIndex = 0;//下指标
        int sum = 0;//滑动窗口的大小
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            sum += nums[fastIndex];
            //找到了满足条件的窗口，收缩慢指针，尝试找到最小
            while (target <= sum) {
                int len = fastIndex - slowIndex + 1;
                minLen = Math.min(minLen, len);
                //重新计算下一个窗口
                sum -= nums[slowIndex];
                //移动个位置
                slowIndex++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }


}

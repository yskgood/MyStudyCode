package com.ysk.leetcode.array.search;

/**
 * 704. 二分查找
 * 关键信息：排序数组（注意排序的方向）
 * 查询的时候从中间查询，有三种情况
 * 1、中间位置val和目标值相同，找到返回
 * 2、中间位置val比目标值大说明下次寻找的方向在左区间，继续从中间位置寻找
 * 3、中间位置val比目标值小说明下次寻找的方向在右区间，继续从中间位置寻找
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            //算出中间位置
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
            int milVal = nums[middleIndex];
            if (milVal == target) {
                return middleIndex;
            }
            if (milVal > target) {
                //大于找左边中间
                rightIndex = middleIndex - 1;
            }
            if (milVal < target) {
                //小于找右边中间
                leftIndex = middleIndex + 1;
            }
        }

        return -1;
    }

}

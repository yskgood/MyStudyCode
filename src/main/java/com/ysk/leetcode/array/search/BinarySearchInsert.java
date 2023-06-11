package com.ysk.leetcode.array.search;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */
public class BinarySearchInsert {

    public int searchInsert(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int lastNum = 0;
        int lastIndex = 0;
        while (leftIndex <= rightIndex) {
            //找出中间位置
            lastIndex = leftIndex + (rightIndex - leftIndex) / 2;
            lastNum = nums[lastIndex];
            if (lastNum == target) {
                return lastIndex;
            }
            //如果当前值大于目标值，就去左边找
            else if (lastNum > target) {
                rightIndex = lastIndex - 1;
            }
            //否则去右边找
            else {
                leftIndex = lastIndex + 1;
            }

        }
        //都没有找到，如果最后的位置比目标值大则插入左边，否则插入右边
        return lastNum > target ? lastIndex : lastIndex + 1;

    }

}

package com.ysk.leetcode.array.search;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class BinarySearchRange {
    public static int[] searchRange(int[] nums, int target) {
        int leftRange = 0;
        int rightRange = nums.length - 1;
        //先找到第一个目标位置
        int firstIndex = binarySearch(nums, leftRange, rightRange, target);
        //如果没有找到直接返回-1
        if (firstIndex == -1) {
            return new int[]{-1, -1};
        }
        //从找到的第一个位置开始
        leftRange = firstIndex;
        rightRange = firstIndex;
        //如果找到了，基于目标位置再分别递归找左边和右边，确定左边界和右边界值，如都没有找到则返回当前的位置
        //递归找左边
        int tempLeftRange = leftRange;
        while (binarySearch(nums, 0, --tempLeftRange, target) != -1) {
            leftRange = tempLeftRange;
        }
        //递归找右边
        int tempRightRange = rightRange;
        while (binarySearch(nums, ++tempRightRange, nums.length - 1, target) != -1) {
            rightRange = tempRightRange;
        }

        return new int[]{leftRange, rightRange};

    }

    private static int binarySearch(int[] nums, int startIndex, int endIndex, int target) {
        int leftIndex = startIndex;
        int rightIndex = endIndex;
        while (leftIndex <= rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;
            int currentNum = nums[middleIndex];
            if (currentNum == target) {
                return middleIndex;
            } else if (currentNum > target) {
                rightIndex = middleIndex - 1;
            } else {
                leftIndex = middleIndex + 1;
            }
        }
        return -1;
    }


}

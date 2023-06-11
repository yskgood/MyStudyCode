package com.ysk.leetcode.array.search;

public class FindLastPosition {

    public static int findLastPosition(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex < rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex + 1) / 2;
            int currentNum = nums[middleIndex];
            if (currentNum == target) {
                //往右边找，包含本位置
                leftIndex = middleIndex;
            } else if (currentNum > target) {
                //往左找
                rightIndex = middleIndex - 1;
            } else {
                //往右边找
                leftIndex = middleIndex + 1;
            }
        }
        if (nums[leftIndex] == target) {
            return leftIndex;
        }
        return -1;
    }
}

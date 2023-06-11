package com.ysk.leetcode.array.remove;

/**
 * 977. 有序数组的平方
 * 关键信息：
 * 1、已经排好序的
 * 2、负数是倒叙，正数是顺序
 */
public class SortedSquares {

    public int[] sortedSquares(int[] nums) {
        int[] tempNums = new int[nums.length];
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int tempRightIndex = tempNums.length - 1;

        while (leftIndex <= rightIndex) {
            int leftVal = nums[leftIndex] * nums[leftIndex];
            int rightVal = nums[rightIndex] * nums[rightIndex];
            if (leftVal >= rightVal) {
                tempNums[tempRightIndex] = leftVal;
                leftIndex++;
            } else {
                tempNums[tempRightIndex] = rightVal;
                rightIndex--;
            }
            //移动到下一个位置
            tempRightIndex--;
        }

        return tempNums;
    }
}

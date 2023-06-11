package com.ysk.leetcode.array.search;

public class FindFirstPosition {

    /**
     * 找到最早出现的位置
     *
     * @param nums
     * @param target
     * @return
     */
    public static int findFirstPosition(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        //注意这里不能用<=
        while (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) >> 1;
            int currentNum = nums[middleIndex];
            if (currentNum == target) {
                //往左边继续找第一个，注意这里不能找+1
                rightIndex = middleIndex;
            } else if (currentNum > target) {
                //往左边继续找
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

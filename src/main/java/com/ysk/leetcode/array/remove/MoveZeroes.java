package com.ysk.leetcode.array.remove;

/**
 * 283.移动零
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != 0) {
                //和slowIndex位置数据替换
                int temp = nums[fastIndex];
                nums[fastIndex] = nums[slowIndex];
                nums[slowIndex] = temp;
                slowIndex++;
            }
        }
    }

}

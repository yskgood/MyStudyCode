package com.ysk.leetcode.string;

/**
 * 344. 反转字符串
 * 思路：
 * 使用双指针从头尾开始替换
 */
public class ReverseString {

    public void reverseString(char[] s) {
        int leftIndex = 0;
        int rightIndex = s.length - 1;
        //互换
        while (leftIndex < rightIndex) {
            char leftVal = s[leftIndex];
            char rightVal = s[rightIndex];
            s[leftIndex] = rightVal;
            s[rightIndex] = leftVal;
            leftIndex++;
            rightIndex--;
        }
    }
}

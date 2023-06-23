package com.ysk.leetcode.string;

/**
 * 58 - II. 左旋转字符串
 */
public class ReverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        String topStr = s.substring(0, n);
        String remainStr = s.substring(n);
        return remainStr + topStr;
    }
}

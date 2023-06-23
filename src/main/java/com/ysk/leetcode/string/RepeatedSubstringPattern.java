package com.ysk.leetcode.string;

/**
 * 459. 重复的子字符串
 */
public class RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {
        char[] sourceArray = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < sourceArray.length - 1; i++) {
            builder.append(sourceArray[i]);
            if (repeated(s, builder.toString())) {
                return true;
            }
        }

        return false;
    }

    private static boolean repeated(String s, String subStr) {
        int len = subStr.length();
        //如果不能整除说明一定不能重复
        if (s.length() % len > 0) {
            return false;
        }
        //查看每段字符是否一样
        int state = s.length() / len;
        for (int i = 0; i < state; i++) {
            String stateStr = s.substring(i * len, (i + 1) * len);
            if (!stateStr.equals(subStr)) {
                return false;
            }
        }
        return true;
    }
}

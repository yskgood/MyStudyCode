package com.ysk.leetcode.string;

/**
 * 28. 找出字符串中第一个匹配项的下标
 */
public class StrStr {

    public static int strStr(String haystack, String needle) {
        //长度超过肯定不包含
        if (needle.length() > haystack.length()) {
            return -1;
        }
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        for (int i = 0; i < haystackArray.length; i++) {
            boolean find = true;
            int k = 0;
            //匹配needle中的字符是否连续出现在haystack中
            for (int j = i; k < needleArray.length && j < haystackArray.length; k++, j++) {
                if (needleArray[k] != haystackArray[j]) {
                    find = false;
                    break;
                }
            }
            //所有字符都匹配，且needle是全部匹配了（注意）
            if (find && needleArray.length == k) {
                return i;
            }
        }
        return -1;
    }
}

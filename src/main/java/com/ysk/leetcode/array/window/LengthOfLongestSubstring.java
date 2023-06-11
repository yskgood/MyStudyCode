package com.ysk.leetcode.array.window;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 * 思路：
 * 1、使用一个Map记录每个字符出现的次数，当次数大于1时表示有重复
 * 2、快慢指针组成滑动窗口，当出现重复时滑动慢指针，删除第一次重复的字符
 * 3、不断检测最大长度
 *
 * @see TotalFruit
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        //总体思路：使用一个Map记录每个字符出现的次数，当次数大于1时表示有重复，删除之前的字符
        //需要用到快慢指针组成滑动窗口

        //先定义最大长度
        int maxLen = 0;

        //定义快慢指针
        int fastIndex = 0;
        int slowIndex = 0;
        Map<Character, Integer> tempMap = new HashMap<>();

        //将字符转化成数组方便处理
        char[] sourceArray = s.toCharArray();

        //循环开始找
        for (; fastIndex < sourceArray.length; fastIndex++) {
            tempMap.put(sourceArray[fastIndex], tempMap.getOrDefault(sourceArray[fastIndex], 0) + 1);
            //去除重复的
            if (hasRepeat(tempMap)) {
                Character key = sourceArray[slowIndex];
                tempMap.put(key, tempMap.get(key) - 1);
                //移动窗口
                slowIndex++;
            }
            //记录最大长度
            maxLen = Math.max(maxLen, fastIndex - slowIndex + 1);
        }

        return maxLen;
    }

    private boolean hasRepeat(Map<Character, Integer> tempMap) {
        //如果字符数量大于1就表示有重复
        for (Map.Entry<Character, Integer> entry : tempMap.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }
        return false;
    }


}

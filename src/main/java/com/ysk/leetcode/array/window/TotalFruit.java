package com.ysk.leetcode.array.window;

import java.util.HashMap;
import java.util.Map;

/**
 * 904. 水果成篮
 * 找出任意两个数字，在列表中最大的长度
 * 思路：
 * 1、快慢指针形成滑动窗口
 * 2、Map的快查表
 *
 * @see LengthOfLongestSubstring
 */
public class TotalFruit {

    public static int totalFruit(int[] fruits) {

        Map<Integer, Integer> bucket = new HashMap<>();

        int slowIndex = 0, maxLength = 0;
        for (int fastIndex = 0; fastIndex < fruits.length; ++fastIndex) {
            //将水果放入篮子，并记录数量
            bucket.put(fruits[fastIndex], bucket.getOrDefault(fruits[fastIndex], 0) + 1);
            //只能摘两种水果，多余的化移除之前采摘的水果
            while (bucket.size() > 2) {
                bucket.put(fruits[slowIndex], bucket.get(fruits[slowIndex]) - 1);
                if (bucket.get(fruits[slowIndex]) == 0) {
                    bucket.remove(fruits[slowIndex]);
                }
                ++slowIndex;
            }
            //计算当前的最大长度
            maxLength = Math.max(maxLength, fastIndex - slowIndex + 1);
        }
        return maxLength;
    }


}

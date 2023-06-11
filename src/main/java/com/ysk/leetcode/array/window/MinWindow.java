package com.ysk.leetcode.array.window;


import java.util.HashMap;
import java.util.Map;

/**
 * 76. 最小覆盖子串
 * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串。
 * 思路：
 * 1、将字符串先转化成字符数组
 * 2、快慢指针的滑动窗口
 * 3、以空间换时间，将找到的字符放入一个快查表中
 * 4、先找到一个最大包含的区间，再收缩，获取最小区间
 *
 * @see MinSubArrayLen
 * @see TotalFruit
 */
public class MinWindow {

    public static String minWindow(String s, String t) {
        //先转后成字符数组处理
        char[] sourceArray = s.toCharArray();
        //目标转化成Map方便查找
        char[] targetArray = t.toCharArray();
        Map<Character, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < targetArray.length; i++) {
            targetMap.put(targetArray[i], targetMap.getOrDefault(targetArray[i], 0) + 1);
        }

        //目标区间
        int minLen = Integer.MAX_VALUE;
        int minLeftIndex = -1;
        int minRightIndex = -1;

        //快慢指针的滑动窗口区间寻找
        Map<Character, Integer> findMap = new HashMap<>();
        int fastIndex = 0;
        int slowIndex = 0;
        for (; fastIndex < sourceArray.length; fastIndex++) {
            //放入遇到的字符串
            findMap.put(sourceArray[fastIndex], findMap.getOrDefault(sourceArray[fastIndex], 0) + 1);

            //如果全部找到，开始收缩窗口，尝试找到最小的区间
            while (findAll(findMap, targetMap)) {
                //更新最小长度
                int len = fastIndex - slowIndex + 1;
                if (minLen > len) {
                    minLen = len;
                    minLeftIndex = slowIndex;
                    minRightIndex = fastIndex;
                }
                //收缩窗口
                Character slowKey = sourceArray[slowIndex];
                findMap.put(slowKey, findMap.get(slowKey) - 1);
                //如果为0了就删除
                if (findMap.get(slowKey) == 0) {
                    findMap.remove(slowKey);
                }
                slowIndex++;
            }

        }

        //没有找到
        if (minLeftIndex == -1 || minRightIndex == -1) {
            return "";
        }

        return String.valueOf(sourceArray, minLeftIndex, minRightIndex - minLeftIndex + 1);
    }

    private static boolean findAll(Map<Character, Integer> findMap, Map<Character, Integer> targetMap) {
        for (Map.Entry<Character, Integer> entry : targetMap.entrySet()) {
            Character key = entry.getKey();
            if (!findMap.containsKey(key) || findMap.get(key) < entry.getValue()) {
                return false;
            }
        }
        return true;
    }



}

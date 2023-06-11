package com.ysk.leetcode.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. 有效的字母异位词
 */
public class Anagram {

    /**
     * 思路1：使用一个Map记录每个字符出现的次数，如果在s中出现就增加，在t中出现就减少，最后看是否所有字符数量都为0，如果不是就不对
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        //将字符串转化成字符数组后
        char[] sourceArray = s.toCharArray();
        char[] targetArray = t.toCharArray();
        if (sourceArray.length != targetArray.length) {
            return false;
        }
        //放入Map，记录每个字符的数量,s有就增加数量，t中有就减少数量
        Map<Character, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < sourceArray.length; i++) {
            //原字符增加
            tempMap.put(sourceArray[i], tempMap.getOrDefault(sourceArray[i], 0) + 1);
            //目标字符相见
            tempMap.put(targetArray[i], tempMap.getOrDefault(targetArray[i], 0) - 1);

        }
        //最后看Map的值是否都为0
        for (Map.Entry<Character, Integer> entry : tempMap.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * 思路2：使用26容量数组来存储每个字符的数量，字符-'a'即为字符的所在数组的下标
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram2(String s, String t) {
        //将字符串转化成字符数组后
        char[] sourceArray = s.toCharArray();
        char[] targetArray = t.toCharArray();
        if (sourceArray.length != targetArray.length) {
            return false;
        }

        //初始化一个数组，用于存储字符的出现的数量
        int[] ct = new int[26];
        for (int i = 0; i < sourceArray.length; i++) {
            ct[sourceArray[i] - 'a']++;
            ct[targetArray[i] - 'a']--;
        }

        //看下是否都为0
        for (int i = 0; i < ct.length; i++) {
            if (ct[i] != 0) {
                return false;
            }
        }

        return true;
    }
}

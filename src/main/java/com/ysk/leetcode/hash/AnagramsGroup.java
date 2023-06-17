package com.ysk.leetcode.hash;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 49. 字母异位词分组
 * 思路：
 * 1.找出字母异位词的特点
 * 1.1、将字符排序后组成的字符串一样
 * 1.2、每个字符出现的次数一样
 * <p>
 * 2.将字母异位词的特点作为Key放入哈希表，值放入符合特征的所有单词
 */
public class AnagramsGroup {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagramMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            String anagramKey = convert2(str);
            if (!anagramMap.containsKey(anagramKey)) {
                anagramMap.put(anagramKey, new ArrayList<>());
            }
            anagramMap.get(anagramKey).add(str);
        }


        return anagramMap.values().stream().collect(Collectors.toList());
    }

    /**
     * 特征1：将字符排序后组成的字符串一样
     *
     * @param str
     * @return
     */
    private static String convert(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    /**
     * 特征2：每个字符出现的次数一样
     *
     * @param str
     * @return
     */
    private static String convert2(String str) {
        char[] chars = str.toCharArray();
        //注意：这里要用一个排序的map来保存，否则构建的结果不一样
        Map<Character, Integer> charCountMap = new TreeMap<>();
        for (int i = 0; i < chars.length; i++) {
            charCountMap.put(chars[i], charCountMap.getOrDefault(chars[i], 0) + 1);
        }
        String result = "";
        //组装一个Key
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            result += "#" + entry.getKey() + "_" + entry.getValue() + "#";
        }

        return result;

    }
}

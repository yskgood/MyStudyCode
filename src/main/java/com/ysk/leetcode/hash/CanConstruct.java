package com.ysk.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 383. 赎金信
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 * 思路：
 * 1、使用Map记录magazine中每个字符出现的次数
 * 2、如果ransomNote使用了一次，就从map中去除一个
 * 3、如果出现字符<=0就退出，说明没找到
 */
public class CanConstruct {

    public boolean canConstruct(String ransomNote, String magazine) {
        char[] magazineArray = magazine.toCharArray();
        Map<Character, Integer> magazineCharMap = new HashMap<>();
        for (char c : magazineArray) {
            magazineCharMap.put(c, magazineCharMap.getOrDefault(c, 0) + 1);
        }
        //查询目标字符是否都存在
        char[] ransomNoteArray = ransomNote.toCharArray();
        for (char c : ransomNoteArray) {
            if (!magazineCharMap.containsKey(c)) {
                return false;
            }
            //减少次数
            int count = magazineCharMap.get(c);
            count--;
            //更新次数，或删除key
            if (count > 0) {
                magazineCharMap.put(c, count);
            } else {
                magazineCharMap.remove(c);
            }
        }
        return true;
    }
}

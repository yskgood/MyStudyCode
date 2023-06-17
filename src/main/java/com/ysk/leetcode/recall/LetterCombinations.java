package com.ysk.leetcode.recall;

import java.util.*;

/**
 * 17：电话好吗的字母组合
 * 思路：
 * 三个要素：选择 (Options)，限制 (Restraints)，结束条件 (Termination)
 * 1、结束条件：字符长度 3^n次方
 * 2、选择：每个数字选择三次
 * 3、限制：
 *
 * @author ysk
 * @date 2023/6/16 5:14 PM
 */
public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new LinkedList<>();
        char[] digitStrArray = digits.toCharArray();
        //字母和对应数字的映射
        Map<Character, Integer> dcMap = new HashMap<>();
        for (int i = 0; i < digitStrArray.length; i++) {
            int digit = Character.getNumericValue(digitStrArray[i]);
            //每个字母映射三个字母
            for (int j = 0; j < 3; j++) {

            }
        }
        return ans;
    }

    private void backTracing(String str, Map<Character, Integer> dcMap, List<String> ans, int len) {
        //结束条件
        if (str.length() == len) {
            ans.add(str);
            return;
        }
        //选择：

        //限制：相同数字的字母只能出现一次

    }
}

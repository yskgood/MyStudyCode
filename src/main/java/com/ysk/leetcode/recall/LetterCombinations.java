package com.ysk.leetcode.recall;

import java.util.*;

/**
 * 17：电话好吗的字母组合
 * 思路：
 * 三个要素：选择 (Options)，限制 (Restraints)，结束条件 (Termination)
 *
 * @author ysk
 * @date 2023/6/16 5:14 PM
 */
public class LetterCombinations {
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new LinkedList<>();
        char[] digitStrArray = digits.toCharArray();
        //字母和对应数字的映射
        Map<Integer, List<String>> digitCharMap = new HashMap<>();
        char c = 'a';
        for (int i = 2; i <= 9; i++) {
            digitCharMap.put(i, new ArrayList<>());
            for (int j = 0; j < (i == 9 || i == 7 ? 4 : 3); j++) {
                digitCharMap.get(i).add(String.valueOf(c++));
            }

        }
        //转换成数字数组
        int[] digitArray = new int[digitStrArray.length];
        if (digitArray.length == 0) {
            return ans;
        }
        for (int i = 0; i < digitStrArray.length; i++) {
            int digit = Character.getNumericValue(digitStrArray[i]);
            digitArray[i] = digit;
        }
        backTracing("", 0, digitArray, digitCharMap, ans);
        return ans;
    }

    private static void backTracing(String str, int digIndex, int[] digitArray, Map<Integer, List<String>> digitCharMap, List<String> ans) {
        //结束条件
        if (str.length() == digitArray.length) {
            ans.add(str);
            return;
        }
        //取处理的数字
        int digit = digitArray[digIndex];
        //取数字对应的Map
        List<String> charList = digitCharMap.get(digit);
        //循环处理Map的字符
        for (int i = 0; i < charList.size(); i++) {
            //递归继续深度遍历
            //注意：str和digIndex不能直接修改，否则影响回溯后的值
            backTracing(str + charList.get(i), digIndex + 1, digitArray, digitCharMap, ans);
        }
    }


}

package com.ysk.leetcode.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 151. 反转字符串中的单词
 * 思路：
 * 1、提取单词
 * 2、单词列表反转
 * 3、组装反转后的结果
 */
public class ReverseWords {

    public static String reverseWords(String s) {
        char[] sourceArray = s.toCharArray();
        List<String> wordList = new LinkedList<>();
        //提取所有单词
        int left = 0;
        while (left < sourceArray.length) {
            //空格继续处理
            if (sourceArray[left] == ' ') {
                left++;
                continue;
            }

            StringBuilder wordBuild = new StringBuilder();
            while (left < sourceArray.length && sourceArray[left] != ' ') {
                wordBuild.append(sourceArray[left]);
                left++;
            }
            wordList.add(wordBuild.toString());

        }

        //单词反转
        Collections.reverse(wordList);
        //转化成字符
        StringBuilder resultBuild = new StringBuilder();
        for (String word : wordList) {
            if (resultBuild.length() == 0) {
                resultBuild.append(word);
            } else {
                resultBuild.append(" " + word);
            }
        }

        return resultBuild.toString();

    }
}

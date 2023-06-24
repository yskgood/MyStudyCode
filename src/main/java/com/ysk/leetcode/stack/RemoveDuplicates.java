package com.ysk.leetcode.stack;

import java.util.Stack;

/**
 * 1047. 删除字符串中的所有相邻重复项
 * 思路：使用栈将相邻的字符排除
 */
public class RemoveDuplicates {

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            //检查上个字符是否一致，如果一致弹出
            if (stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }

        }

        //返回剩余的内容
        if (stack.isEmpty()) {
            return "";
        }
        //转化成正常的顺序
        Stack<Character> outPut = new Stack<>();
        while (!stack.isEmpty()) {
            outPut.push(stack.pop());
        }
        //组装成字符串
        StringBuilder strBuild = new StringBuilder();
        while (!outPut.isEmpty()) {
            strBuild.append(outPut.pop());
        }

        return strBuild.toString();
    }
}

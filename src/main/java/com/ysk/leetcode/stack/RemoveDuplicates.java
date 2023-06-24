package com.ysk.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;
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

    public String removeDuplicates2(String s) {
        // 将 res 当做栈
        // 也可以用 StringBuilder 来修改字符串，速度更快
        // StringBuilder res = new StringBuilder();
        StringBuffer res = new StringBuffer();
        // top为 res 的长度
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 当 top > 0,即栈中有字符时，当前字符如果和栈中字符相等，弹出栈顶字符，同时 top--
            if (top >= 0 && res.charAt(top) == c) {
                res.deleteCharAt(top);
                top--;
                // 否则，将该字符 入栈，同时top++
            } else {
                res.append(c);
                top++;
            }
        }
        return res.toString();
    }

    /**
     * 使用双向队列作为栈实现
     *
     * @param s
     * @return
     */
    public static String removeDuplicates3(String s) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (deque.isEmpty() || deque.peek() != c) {
                deque.push(c);
            } else {
                deque.pop();
            }
        }

        //转化成字符串
        StringBuilder stringBuilder = new StringBuilder();
        while (!deque.isEmpty()) {
            //注意：为了顺序正常这里要从尾部开始输出
            stringBuilder.append(deque.removeLast());
        }

        return stringBuilder.toString();

    }
}

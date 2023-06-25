package com.ysk.leetcode.stack;

import java.util.Stack;

/**
 * 20. 有效的括号
 * 思路：
 * 使用栈，当遇到左括号时入，右括号时如何和当前的头配对就出，否则就入，最后看stack是否为空
 */
public class ParenthesesIsValid {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                //如果先入的右括号，一定不匹配
                if (stack.isEmpty()) {
                    return false;
                }
                //配对的化就出栈
                if (getLeftPair(c) == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

        }

        return stack.isEmpty();
    }

    /**
     * 获取右括号对应的左括号
     *
     * @param c
     * @return
     */
    private static char getLeftPair(char c) {
        if (c == ')') {
            return '(';
        }
        if (c == '}') {
            return '{';
        }
        return '[';
    }
}

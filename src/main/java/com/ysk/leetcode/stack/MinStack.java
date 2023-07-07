package com.ysk.leetcode.stack;

import java.util.*;

/**
 * 155. 最小栈
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)
 *
 * @author ysk
 * @date 2023/6/26 5:59 PM
 */
public class MinStack {
    /**
     * 用于存储所有元素，保证入栈 push() 函数、出栈 pop() 函数、获取栈顶 top() 函数的正常逻辑
     */
    private Stack<Integer> stack;
    /**
     * 存储stack中所有非严格降序的元素
     */
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            //只放入比栈顶小的元素
            if (minStack.peek() >= val) {
                minStack.push(val);
            }
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int num = stack.pop();
            //如果当前值相同就弹出
            if (!minStack.isEmpty() && minStack.peek() == num) {
                minStack.pop();
            }
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

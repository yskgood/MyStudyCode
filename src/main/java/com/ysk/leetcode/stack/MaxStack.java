package com.ysk.leetcode.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 716. 最大栈
 */
public class MaxStack {

    private Stack<Integer> stack;
    private Stack<Integer> maxStack;

    public MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (maxStack.isEmpty()) {
            maxStack.push(x);
        } else {
            if (maxStack.peek() <= x) {
                maxStack.push(x);
            }
        }
    }

    public int pop() {
        int num = stack.pop();
        if (num == maxStack.peek()) {
            maxStack.pop();
        }
        return num;
    }

    public int top() {
        return stack.peek();
    }

    public int peekMax() {
        return maxStack.peek();
    }

    public int popMax() {
        int maxNum = maxStack.pop();
        //从stack中删除
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.peek().equals(maxNum)) {
            tempStack.push(stack.pop());
        }
        //删除
        stack.pop();
        //放回来
        if (!tempStack.isEmpty()) {
            push(tempStack.pop());
        }
        return maxNum;
    }
}

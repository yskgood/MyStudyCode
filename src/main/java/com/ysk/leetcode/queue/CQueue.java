package com.ysk.leetcode.queue;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 *
 * @author ysk
 * @date 2023/6/26 5:42 PM
 */
public class CQueue {

    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public CQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void appendTail(int value) {
        inputStack.push(value);
    }

    public int deleteHead() {
        if (inputStack.isEmpty() && outputStack.isEmpty()) {
            return -1;
        }
        if (!outputStack.isEmpty()) {
            outputStack.pop();
        }
        while (!inputStack.isEmpty()) {
            outputStack.push(inputStack.pop());
        }
        return outputStack.pop();
    }
}

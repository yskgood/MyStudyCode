package com.ysk.leetcode.queue;

import java.util.Stack;

/**
 * 232. 用栈实现队列
 * 思路：使用栈来模式队列的行为，如果仅仅用一个栈，是一定不行的，所以需要两个栈一个输入栈，一个输出栈，这里要注意输入栈和输出栈的关系。
 */
public class MyQueue {

    /**
     * 接收插入操作
     */
    Stack<Integer> inputStack;
    /**
     * 输出列表
     */
    Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void push(int x) {
        //互换outputStack到inputStack，欢迎插入的顺序
        while (!outputStack.isEmpty()) {
            inputStack.push(outputStack.pop());
        }
        //插入最新的数据
        inputStack.push(x);
        //互换inputStack到outputStack，恢复操作顺序
        while (!inputStack.isEmpty()) {
            outputStack.push(inputStack.pop());
        }
    }

    public int pop() {
        return outputStack.pop();
    }

    public int peek() {
        return outputStack.peek();
    }

    public boolean empty() {
        return outputStack.isEmpty();
    }

}

package com.ysk.leetcode.queue;

import java.util.Stack;

/**
 * 232. 用栈实现队列
 * 进阶：你能否实现每个操作均摊时间复杂度为 O(1) 的队列？换句话说，执行 n 个操作的总时间复杂度为 O(n) ，即使其中一个操作可能花费较长时间。
 */
public class MyQueue2 {

    /**
     * 接收插入操作
     */
    Stack<Integer> inputStack;
    /**
     * 输出列表
     */
    Stack<Integer> outputStack;

    public MyQueue2() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void push(int x) {
        inputStack.push(x);
    }

    public int pop() {
        return outputStack.pop();
    }

    public int peek() {
        return outputStack.peek();
    }

    public boolean empty() {
        return outputStack.isEmpty() && inputStack.isEmpty();
    }

    /**
     * 当outputStack为空的时候，尝试将inputStack的数据放入到outputStack，恢复正常的插入顺序
     */
    private void stackExchange() {
        //还有数据就继续操作
        if (!outputStack.isEmpty()) {
            return;
        }
        //互换inputStack到outputStack，恢复操作顺序
        while (!inputStack.isEmpty()) {
            outputStack.push(inputStack.pop());
        }
    }
}

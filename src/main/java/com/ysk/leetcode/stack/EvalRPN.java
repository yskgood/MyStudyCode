package com.ysk.leetcode.stack;

import java.util.Stack;

/**
 * 150. 逆波兰表达式求值
 * 逆波兰表达式主要有以下两个优点：
 * <p>
 * 去掉括号后表达式无歧义，上式即便写成 1 2 + 3 4 + * 也可以依据次序计算出正确结果。
 * 适合用栈操作运算：遇到数字则入栈；遇到算符则取出栈顶两个数字进行计算，并将结果压入栈中
 */
public class EvalRPN {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            //遇到操作符"+"、"-"、"*" 或 "/"
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                //计算
                if (token.equals("+")) {
                    stack.push(num1 + num2);
                } else if (token.equals("-")) {
                    //注意：操作顺序
                    stack.push(num2 - num1);
                } else if (token.equals("*")) {
                    stack.push(num1 * num2);
                } else {
                    //注意：操作顺序
                    stack.push(num2 / num1);
                }
            } else {
                //数字入栈
                stack.push(Integer.valueOf(token));
            }

        }
        if (stack.isEmpty()) {
            return 0;
        }
        return stack.peek();
    }
}

package com.ysk.leetcode.recall;

import java.util.LinkedList;
import java.util.List;

/**
 * 22. 括号生成
 * 思路：
 * 三个要素：选择 (Options)，限制 (Restraints)，结束条件 (Termination)
 * 判断左右括号所剩的数量，最初始都是n;当左括号（(）有剩余，继续做选择；
 * 判断当右括号比左括号剩的多，才能选右括号；继续递归做选择
 * 出口:构建的字符串是 2n的时候，此时已经该分支已经构建完成，加入选项；
 *
 * @author ysk
 * @date 2023/6/16 4:32 PM
 */
public class GenerateParenthesis {

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new LinkedList<>();
        backTracing(n, n, "", ans, n);
        return ans;
    }

    private static void backTracing(int lRemain, int rRemain, String str, List<String> ans, int n) {
        //出口：括号总数一定是2n
        if (str.length() == 2 * n) {
            ans.add(str);
            return;
        }
        //选择：当左括号有选择的时候继续找
        if (lRemain > 0) {
            backTracing(lRemain - 1, rRemain, str + "(", ans, n);
        }
        //限制：判断当右括号比左括号剩的多，才能选右括号
        if (lRemain < rRemain) {
            backTracing(lRemain, rRemain - 1, str + ")", ans, n);
        }

    }
}

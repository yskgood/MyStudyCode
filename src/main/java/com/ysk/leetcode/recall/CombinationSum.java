package com.ysk.leetcode.recall;

import java.util.LinkedList;
import java.util.List;

/**
 * 39:组合总和
 *
 * @author ysk
 * @date 2023/6/19 5:09 PM
 */
public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new LinkedList<>();
        backTracing(new LinkedList<>(), 0, candidates, target, ans);
        return ans;
    }

    private static void backTracing(List<Integer> result, int startIndex, int[] candidates, int target, List<List<Integer>> ans) {
        //结束条件1:总数不能超过150个
        if (ans.size() >= 150) {
            return;
        }
        //结束条件2：和>=target
        long sum = sumList(result);
        //找到就加入结果中
        if (sum == target) {
            ans.add(result);
            return;
        }
        //大于就推出
        if (sum > target) {
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            //重新构建一个List，这样不会污染回溯的结果
            List<Integer> tempResult = new LinkedList<>(result);
            //加入值
            tempResult.add(candidates[i]);
            //递归找起来
            backTracing(tempResult, startIndex, candidates, target, ans);
            //跳过已经处理过的
            startIndex++;
        }

    }

    private static long sumList(List<Integer> result) {
        long sum = 0;
        for (Integer i : result) {
            sum += i;
        }
        return sum;
    }


}

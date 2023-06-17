package com.ysk.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. 快乐数
 */
public class HappyNumber {
    public static boolean isHappy(int n) {
        //为了防止循环情况
        Set<Long> sumSet = new HashSet<>();
        //分别计算每个位数的平方
        long sum = n;
        while (sum != 1) {
            char[] numArray = toCharArray(sum);
            long temSum = sumPow(numArray);
            //注意：循环检测
            if (sumSet.contains(temSum)) {
                return false;
            }
            //下次循环
            sumSet.add(temSum);
            sum = temSum;
        }
        return true;
    }

    /**
     * 每位数平方相加
     *
     * @param numArray
     * @return
     */
    private static long sumPow(char[] numArray) {
        long sum = 0;
        int i = 0;
        int j = numArray.length - 1;
        //注意：双指针一起计算，加快计算速度
        while (i < j) {
            //注意：将字符转换成对应数字的方法，不能直接相乘
            sum += Math.pow(Character.getNumericValue(numArray[i]), 2) + Math.pow(Character.getNumericValue(numArray[j]), 2);
            i++;
            j--;
        }
        //注意：中间临界处理
        if (i == j) {
            sum += Math.pow(Character.getNumericValue(numArray[i]), 2);
        }
        return sum;
    }

    /**
     * 将字符串转换成字符数组
     * @param num
     * @return
     */
    private static char[] toCharArray(long num) {
        String str = String.valueOf(num);
        char[] strArray = str.toCharArray();
        return strArray;
    }
}

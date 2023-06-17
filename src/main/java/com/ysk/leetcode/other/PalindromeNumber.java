package com.ysk.leetcode.other;

/**
 * 9:回文整数
 * 思路：
 * 1、数字位数反转
 * 2、通过将数字转换成字符数组做
 *
 * @author ysk
 * @date 2023/6/15 10:49 AM
 */
public class PalindromeNumber {

    /**
     * 思路1：数字位数反转
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        //过来负数
        if (x < 0) {
            return false;
        }
        //算出有多少位(个：1，十：2 百：3 ...）
        int bit = getDigits(x);
        //将x取反
        long sum = 0;
        int m = x;
        for (int i = 1; i <= bit; i++) {
            //注意：取个位数
            int last = m % 10;
            //注意：反转后的数字，需乘10^bit-i 次方
            double result = last * Math.pow(10, bit - i);
            //计算和
            sum += result;
            //注意：取余，继续算
            m = m / 10;
        }

        //相同说明是回文
        return sum == x;
    }

    /**
     * 获取位数
     *
     * @param n
     * @return
     */
    public static int getDigits(int n) {
        int count = 1;
        while ((n = n / 10) != 0) {
            count++;
        }
        return count;
    }

    /**
     * 思路2：通过字符串的方式判断是否回文
     * <p>
     * 双指针应用
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome2(int x) {
        //过来负数
        if (x < 0) {
            return false;
        }
        //将数字转换成字符数组
        char[] numArray = String.valueOf(x).toCharArray();
        //双向指针判断是否位回文
        int left = 0;
        int right = numArray.length - 1;
        while (left <= right) {
            if (numArray[left] != numArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static int[] convertToIntArray(int x) {
        char[] strArray = String.valueOf(x).toCharArray();
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Character.getNumericValue(strArray[i]);
        }
        return intArray;
    }
}
